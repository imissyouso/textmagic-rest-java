
# DoAuthInputObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**username** | **String** | Account username or email | 
**password** | **String** | Account password | 
**appName** | **String** | Application name |  [optional]
**appVersion** | **String** | Application version |  [optional]
**deviceId** | **String** | Device ID for push notification service |  [optional]
**pushServiceType** | **String** | required when deviceId provided. Push notification service type: a for Apple Push Notifications, g for Google Cloud Messaging |  [optional]
**tfaCode** | **String** | required when 2FA enabled on account. 2FA challenge response (SMS code or security question answer) |  [optional]
**tfaId** | **String** | required when 2FA enabled on account. 2FA challenge response (SMS code or security question answer) |  [optional]



