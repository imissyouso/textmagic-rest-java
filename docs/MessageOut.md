
# MessageOut

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Message ID. | 
**sender** | **String** | Message sender (phone number or alphanumeric Sender ID). |  [optional]
**receiver** | **String** | Recipient phone number. |  [optional]
**text** | **String** |  | 
**status** | [**StatusEnum**](#StatusEnum) | Delivery status of the message. TODO: Please see the table below to see different delivery statuses.  | 
**contactId** | **Integer** |  | 
**sessionId** | **Integer** |  | 
**messageTime** | [**OffsetDateTime**](OffsetDateTime.md) | Sending time. | 
**avatar** | **String** |  | 
**deleted** | **Boolean** |  |  [optional]
**charset** | **String** | Message charset. Could be: *   **ISO-8859-1** for plaintext SMS *   **UTF-16BE** for Unicode SMS  | 
**charsetLabel** | **String** |  | 
**firstName** | **String** | Contact first name. Could be substituted from your [Contacts](http://docs.textmagictesting.com/tag#Contacts) (even if you submitted phone number instead of contact ID).  | 
**lastName** | **String** | Contact last name. | 
**country** | **String** | Two-letter ISO country code of the recipient phone number.  | 
**phone** | **String** |  |  [optional]
**price** | **Float** |  |  [optional]
**partsCount** | **Integer** | Message parts (multiples of 160 characters) count. | 
**fromEmail** | **String** |  |  [optional]
**fromNumber** | **String** |  |  [optional]
**smscId** | **String** |  |  [optional]
**contact** | **String** |  |  [optional]
**source** | **String** |  |  [optional]
**deliveredCount** | **Integer** |  |  [optional]
**numbersCount** | **Integer** |  |  [optional]
**userId** | **Integer** |  |  [optional]
**creditsPrice** | **String** |  |  [optional]
**chars** | **Integer** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
Q | &quot;q&quot;
S | &quot;s&quot;
E | &quot;e&quot;
R | &quot;r&quot;
A | &quot;a&quot;
D | &quot;d&quot;
B | &quot;b&quot;
F | &quot;f&quot;
U | &quot;u&quot;
J | &quot;j&quot;
I | &quot;i&quot;
P | &quot;p&quot;
H | &quot;h&quot;



