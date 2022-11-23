from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from webdriver_manager.chrome import ChromeDriverManager
import pandas as pd
import numpy as np

URL = "https://bwport.com/product/list.html?cate_no=389"

# TODO: 판다스 데이터프레임 설정
# pandas set dataframe
column_name = ["name", "roasting", "weight", "price"]
df = pd.DataFrame(columns=column_name)


def driver_call():
    chrome_options = webdriver.ChromeOptions()
    driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()), options=chrome_options)
    driver.get(URL)
    print(driver.current_url)
    driver.implicitly_wait(5)
    return driver


driver = driver_call()


def getsize():
    result = driver.find_elements(by=By.CLASS_NAME, value="text-info")
    cnt = 0
    answer = []
    for i in result:
        cnt = cnt + 1
        answer.append(i.text)
    return answer, cnt


lists, sizes = getsize()
driver.close()
j = 0
for i in range(len(lists)):
    tmp = lists[i]
    if tmp:
        tmp_list = tmp.split('\n')
        if len(tmp_list) == 5:
            tmp_list.pop()
        tmp_second_list = tmp_list[2].split(',')
        tmp_third_list = tmp_second_list[0]
        concat = tmp_third_list[0] + tmp_third_list[1] + tmp_third_list[2]
        tmp_list[2] = int(concat)
        print(tmp_list)
        df.loc[j] = [tmp_list[0], tmp_list[1], tmp_list[2], tmp_list[3]]
        j = j + 1
print(df)
