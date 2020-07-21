# docker-selenium-suite #

**Selenium Official Documentation**
* [example for different language](https://www.selenium.dev/documentation/en/)
* [dependency details] https://www.selenium.dev/documentation/en/selenium_installation/installing_selenium_libraries/)


* This project contain a selenium based project which require a real browser to run and evaluate the test assert, and our goal to achive that expectation through CI/CD based environment which is installed in non-GUI based Linux machine.

* Expected technology being used are -
````
jdk 1.8
selenium
selenium grid
seleniun grid based chrome node
docker
docker-compose
````
* The step to achieve this are- 
> Selenium driver has to be get object from RemoteWebDriver with necessary capability and hub url
> The Junit strat point need to be with maven
> To run this is an unix based non-GUI env, we need some docker image (customised or already built-in) and the image being used in this project are  
````
   - selenium/hub
   - selenium/node-chrome
   - selenium/node-firfox
   - maven:jdk-8
````
> Rather run one after another image and build through a maven docker in an dry env with ad-hoc basis we have choosed docker-compose to achieve this (you can refer docker-compose.yml)
> The command being used for this complete process are 

````
docker-compose up --abort-on-container-exit
docker-compose down -v
````

