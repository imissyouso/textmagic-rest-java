
# Conversation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  | 
**direction** | [**DirectionEnum**](#DirectionEnum) | Message type: inbound or outbound.  | 
**sender** | **String** | Sender phone number. | 
**messageTime** | [**OffsetDateTime**](OffsetDateTime.md) | Time when message arrived at TextMagic. | 
**text** | **String** | Message text. | 
**receiver** | **String** | Receiver phone number. | 
**status** | **String** | Message status (for chats outbound only). See [message delivery statuses](/docs/api/sms-sessions/#message-delivery-statuses) for details. | 
**firstName** | **String** | Contact first name. | 
**lastName** | **String** | Contact last name. | 
**sessionId** | **Integer** |  | 


<a name="DirectionEnum"></a>
## Enum: DirectionEnum
Name | Value
---- | -----
IN | &quot;in&quot;
OUT | &quot;out&quot;



