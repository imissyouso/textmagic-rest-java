
# SendMessageResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Message ID. | 
**href** | **String** | URI of message session. | 
**type** | [**TypeEnum**](#TypeEnum) | Message response type: * **message** when message sent to a single recipient * **session** when message sent to multiple recipients * **schedule** when message has been scheduled for sending * **bulk** when message sent to multiple recipient and the number of recipients requires asynchronous processiong See [Sending more than 1,000 messages in one session](http://docs.textmagictesting.com/#section/Tutorials/Sending-more-than-1000-messages-in-one-session).  | 
**sessionId** | **Integer** | Message session ID. | 
**bulkId** | **Integer** | Bulk Session ID. See [Sending more than 1,000 messages in one session](http://docs.textmagictesting.com/#section/Tutorials/Sending-more-than-1000-messages-in-one-session). | 
**messageId** | **Integer** | Message ID. | 
**scheduleId** | **Integer** | Message Schedule ID. | 
**chatId** | **Integer** | Message Chat ID. | 


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
MESSAGE | &quot;message&quot;
SESSION | &quot;session&quot;
SCHEDULE | &quot;schedule&quot;
BULK | &quot;bulk&quot;



