
# CreateContactInputObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**firstName** | **String** | Contact first name. |  [optional]
**lastName** | **String** | Contact last name. |  [optional]
**phone** | **String** | Phone number in [E.164 format](https://en.wikipedia.org/wiki/E.164). | 
**email** | **String** | Contact email address. |  [optional]
**companyName** | **String** | Company name. |  [optional]
**lists** | **String** | Contact [list](http://docs.textmagictesting.com/#tag/Lists) ID. Each contact must be assigned to at least one list. | 
**favorited** | **Boolean** | Is contact marked as favorite. |  [optional]
**blocked** | **Boolean** | Is contact blocked for outgoing and incoming messaging. |  [optional]
**type** | **Integer** | Force type of phone. Possible values: 0 - landline, 1 - mobile. Default is -1 (auto detection). |  [optional]
**customFieldValues** | [**List&lt;CustomFieldListItem&gt;**](CustomFieldListItem.md) |  |  [optional]
**local** | **Integer** | Treat phone number passed in request body as local |  [optional]
**country** | **String** | 2-letter ISO country code for local phone numbers, used when local is  set to true. Default is account country |  [optional]



