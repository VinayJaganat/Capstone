import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

@pytest.fixture
def setup():
    driver = webdriver.Chrome()  # You can change this to your preferred WebDriver
    yield driver
    driver.quit()

def test_flipkart_eCommerce_flow(setup):
    driver = setup


    driver.get("https://www.flipkart.com/")
    driver.maximize_window()
    image = driver.find_element(By.XPATH, "//input[@placeholder='Search for Products, Brands and More']")

    if image.is_displayed():
        print("Element is displayed.")
    else:
        print("Element is not displayed.")


    search_box = driver.find_element(By.XPATH, "//input[@placeholder='Search for Products, Brands and More']")
    search_box.send_keys("Macbook air m2")
    search_box.submit()


    first_item = WebDriverWait(driver, 10).until(
        EC.element_to_be_clickable((By.XPATH, "(//div[@class='_3pLy-c row'])[1]/div/div[@class='_4rR01T']"))
    )
    first_item.click()

    driver.switch_to.window(driver.window_handles[1])

    add_to_cart_button = driver.find_element(By.XPATH, "(//li[@class='col col-6-12'])[1]")
    add_to_cart_button.click()

    cartIcon = driver.find_element(By.XPATH, "//span[text()='Cart']")
    cartIcon.click()


    success_message = WebDriverWait(driver, 10).until(
        EC.visibility_of_element_located((By.XPATH, "//a[@class='_2Kn22P gBNbID']"))
    )