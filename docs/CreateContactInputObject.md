
# CreateContactInputObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**firstName** | **String** | Contact first name |  [optional]
**lastName** | **String** | Contact last name |  [optional]
**phone** | **String** | Contact phone number in E.164 (international) format without leading + or zeroes | 
**email** | **String** | Contact email |  [optional]
**companyName** | **String** | Contact company name |  [optional]
**lists** | **String** | Array of list resources id contact will be assigned to | 
**favorited** | **Boolean** | Is contact favorited |  [optional]
**blocked** | **Boolean** | Is contact blocked for outgoing and incoming messaging |  [optional]
**type** | **Integer** | Force type of phone. Possible values: 0 - landline, 1 - mobile. Default is -1 (auto detection) |  [optional]
**customFieldValues** | **Object** |  |  [optional]
**local** | **Integer** | Treat phone number passed in request body as local |  [optional]
**country** | **String** | 2-letter ISO country code for local phone numbers, used when local is  set to true. Default is account country |  [optional]



