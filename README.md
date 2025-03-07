<h1>Allure notifications :sun_with_face:</h1>
<h6>for telegram, slack, skype, email, mattermost</h6>

<h3>Languages:</h3>

![](readme_images/languages/United-Kingdom.png) ![](readme_images/languages/France.png) ![](readme_images/languages/Russia.png) ![](readme_images/languages/Ukraine.png)</h5>

| Telegram | Slack |
:-------------------------:|:-------------------------:
![shakal_screenshot](readme_images/telegram-en.png) | ![shakal_screenshot](readme_images/slack-en.png)
| **Mattermost** | **Email** |
![shakal_screenshot](readme_images/mattermost-ru.png) | ![shakal_screenshot](readme_images/email_en.png) 
| **Skype** | **Icq**  |
| Done | Wat? lol |


<h6>How to:</h6>

- [x] [Telegram config](https://github.com/qa-guru/allure-notifications/wiki/Telegram-configuration)
- [x] [Slack config](https://github.com/qa-guru/allure-notifications/wiki/Slack-configuration)
- [ ] [Email config](https://github.com/qa-guru/allure-notifications/wiki/Email-configuration)
- [x] [Skype config](https://github.com/qa-guru/allure-notifications/wiki/Skype-Bot-Configuration)
- [x] [Mattermost config](https://github.com/qa-guru/allure-notifications/wiki/Skype-configuration)


<h6>CommandLine options</h6>
All keys should be used with `-D`: <br/> 

| key | description | 
|:---:| :---------: |
| projectName | Name of project |
| env | Environment (Test, Prod, etc.) name |
| comment | Any comment here |
| reportLink | Jenkins Build URL |
| config.file | Path to JSON-config file |

```
java \
"-DprojectName=${PROJECT_NAME}" \
"-Denv=${ENVIRONMENT}" \
"-DreportLink=${BUILD_URL}" \
"-Dcomm=Any comment here" \
"-Dconfig.file=${PATH_TO_FILE}" \
-jar allure-notifications-3.1.2.jar
```

<h6>Config file structure</h6>
Here you can find config file structure for lib configuration.

```json
{
  "app": {
    "bot": {
      "token": "",
      "chat": "",
      "replyTo": ""
    },
    "base": {
      "lang": "",
      "messenger": "",
      "allureFolder": "",
      "allureLinkPath": "",
      "chart": false,
      "chartName": "",
      "project": ""
    },
    "mail": {
      "host": "",
      "port": "",
      "username": "",
      "password": "",
      "enableSSL": false,
      "from": "",
      "recipient": ""
    },
    "mattermost": {
      "url": ""
    },
    "proxy": {
      "host": "",
      "port": 0,
      "username": "",
      "password": ""
    },
    "skype": {
      "appId": "",
      "appSecret": "",
      "serviceUrl": "",
      "conversationId": "",
      "botId": "",
      "botName": ""
    }
  }
}
```
You only need to fill needed options in `bot`, `base`, `mail` or `proxy` section. Please, be careful, `lang` and `messenger` fields are required!

Example for Telegram messenger:
```json
{
  "app": {
    "bot": {
      "token": "asdhsdgfjsdfgFgjhg4831)@",
      "chat": "-1",
      "replyTo": ""
    },
    "base": {
      "lang": "en",
      "messenger": "telegram",
      "allureFolder": "build/allure-report/",
      "allureLinkPath": "allure",
      "chart": true,
      "chartName": "",
      "project": ""
    },
    "mail": {
      "host": "",
      "port": "",
      "username": "",
      "password": "",
      "enableSSL": false,
      "from": "",
      "recipient": ""
    },
    "mattermost": {
      "url": ""
    },
    "proxy": {
      "host": "",
      "port": 0,
      "username": "",
      "password": ""
    },
    "skype": {
      "appId": "",
      "appSecret": "",
      "serviceUrl": "",
      "conversationId": "",
      "botId": "",
      "botName": ""
    }
  }
}
```
