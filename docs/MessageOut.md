
# MessageOut

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  | 
**contactId** | **Integer** |  | 
**sessionId** | **Integer** |  | 
**receiver** | **String** |  |  [optional]
**messageTime** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**status** | [**StatusEnum**](#StatusEnum) | q - queued s - scheduled queue e - sending error r - enroute a - acked d - delivered b - buffered f - failed u - unknown j - rejected i - bulk insert p - scheduled suspend h - queue suspend | 
**avatar** | **String** |  | 
**text** | **String** |  | 
**deleted** | **Boolean** |  |  [optional]
**charset** | **String** |  | 
**charsetLabel** | **String** |  | 
**firstName** | **String** |  | 
**lastName** | **String** |  | 
**country** | **String** |  | 
**sender** | **String** |  |  [optional]
**phone** | **String** |  |  [optional]
**price** | **Float** |  |  [optional]
**partsCount** | **Integer** |  | 
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



