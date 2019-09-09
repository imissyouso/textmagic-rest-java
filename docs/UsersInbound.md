
# UsersInbound

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  | 
**user** | [**User**](User.md) |  | 
**purchasedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**expireAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**status** | [**StatusEnum**](#StatusEnum) | A - active, in use (at least one message was sent/received from/to this number), U - never used before | 
**country** | [**Country**](Country.md) |  | 
**phone** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
U | &quot;U&quot;
A | &quot;A&quot;



