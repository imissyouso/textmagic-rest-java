# OutboundMessagesApi

All URIs are relative to *http://my.textmagic.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAllOutboundMessages**](OutboundMessagesApi.md#deleteAllOutboundMessages) | **DELETE** /api/v2/message/all | Delete all messages
[**deleteOutboundMessage**](OutboundMessagesApi.md#deleteOutboundMessage) | **DELETE** /api/v2/messages/{id} | Delete message
[**deleteOutboundMessagesBulk**](OutboundMessagesApi.md#deleteOutboundMessagesBulk) | **POST** /api/v2/messages/delete | Delete messages by IDs
[**getAllOutboundMessages**](OutboundMessagesApi.md#getAllOutboundMessages) | **GET** /api/v2/messages | Get all messages
[**getMessagePreview**](OutboundMessagesApi.md#getMessagePreview) | **GET** /api/v2/messages/preview | Preview message
[**getMessagePrice**](OutboundMessagesApi.md#getMessagePrice) | **GET** /api/v2/messages/price | Check price
[**getMessagePrices**](OutboundMessagesApi.md#getMessagePrices) | **GET** /api/v2/messages/prices | Get pricing
[**getOutboundMessage**](OutboundMessagesApi.md#getOutboundMessage) | **GET** /api/v2/messages/{id} | Get a single message
[**getOutboundMessagesHistory**](OutboundMessagesApi.md#getOutboundMessagesHistory) | **GET** /api/v2/history | Get history
[**searchOutboundMessages**](OutboundMessagesApi.md#searchOutboundMessages) | **GET** /api/v2/messages/search | Find messages
[**sendMessage**](OutboundMessagesApi.md#sendMessage) | **POST** /api/v2/messages | Send message
[**uploadMessageAttachment**](OutboundMessagesApi.md#uploadMessageAttachment) | **POST** /api/v2/messages/attachment | Upload message attachment


<a name="deleteAllOutboundMessages"></a>
# **deleteAllOutboundMessages**
> deleteAllOutboundMessages()

Delete all messages

Delete all messages.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.OutboundMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

OutboundMessagesApi apiInstance = new OutboundMessagesApi();
try {
    apiInstance.deleteAllOutboundMessages();
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundMessagesApi#deleteAllOutboundMessages");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteOutboundMessage"></a>
# **deleteOutboundMessage**
> deleteOutboundMessage(id)

Delete message

Delete a single message.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.OutboundMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

OutboundMessagesApi apiInstance = new OutboundMessagesApi();
Integer id = 1; // Integer | 
try {
    apiInstance.deleteOutboundMessage(id);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundMessagesApi#deleteOutboundMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteOutboundMessagesBulk"></a>
# **deleteOutboundMessagesBulk**
> deleteOutboundMessagesBulk(deleteOutboundMessagesBulkInputObject, xIgnoreNullValues)

Delete messages by IDs

Delete outbound messages by given ID(s) or delete all outbound messages.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.OutboundMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

OutboundMessagesApi apiInstance = new OutboundMessagesApi();
DeleteOutboundMessagesBulkInputObject deleteOutboundMessagesBulkInputObject = new DeleteOutboundMessagesBulkInputObject(); // DeleteOutboundMessagesBulkInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    apiInstance.deleteOutboundMessagesBulk(deleteOutboundMessagesBulkInputObject, xIgnoreNullValues);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundMessagesApi#deleteOutboundMessagesBulk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteOutboundMessagesBulkInputObject** | [**DeleteOutboundMessagesBulkInputObject**](DeleteOutboundMessagesBulkInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getAllOutboundMessages"></a>
# **getAllOutboundMessages**
> GetAllOutboundMessagesResponse getAllOutboundMessages(page, limit, lastId)

Get all messages

Get all user oubound messages.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.OutboundMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

OutboundMessagesApi apiInstance = new OutboundMessagesApi();
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
Integer lastId = 56; // Integer | Filter results by ID, selecting all values lesser than the specified ID. Note that \\'page\\' parameter is ignored when \\'lastId\\' is specified
try {
    GetAllOutboundMessagesResponse result = apiInstance.getAllOutboundMessages(page, limit, lastId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundMessagesApi#getAllOutboundMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]
 **lastId** | **Integer**| Filter results by ID, selecting all values lesser than the specified ID. Note that \\&#39;page\\&#39; parameter is ignored when \\&#39;lastId\\&#39; is specified | [optional]

### Return type

[**GetAllOutboundMessagesResponse**](GetAllOutboundMessagesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMessagePreview"></a>
# **getMessagePreview**
> GetMessagePreviewResponse getMessagePreview(text, templateId, sendingTime, sendingDateTime, sendingTimezone, contacts, lists, phones, cutExtra, partsCount, referenceId, from, rule, createChat, tts, local, localCountry)

Preview message

Get messages preview (with tags merged) up to 100 messages per session.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.OutboundMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

OutboundMessagesApi apiInstance = new OutboundMessagesApi();
String text = "\"Test message test\""; // String | Message text. Required if template_id is not set
Integer templateId = 1; // Integer | Template used instead of message text. Required if text is not set
Integer sendingTime = 1565606455; // Integer | DEPRECATED, consider using sendingDateTime and sendingTimezone parameters instead: Optional (required with rrule set). Message sending time in unix timestamp format. Default is now
String sendingDateTime = "\"2020-05-27 13:02:33\""; // String | Sending time in Y-m-d H:i:s format (e.g. 2016-05-27 13:02:33). This time is relative to sendingTimezone
String sendingTimezone = "\"America/Buenos_Aires\""; // String | ID or ISO-name of timezone used for sending when sendingDateTime parameter is set. E.g. if you specify sendingDateTime = \\\"2016-05-27 13:02:33\\\" and sendingTimezone = \\\"America/Buenos_Aires\\\", your message will be sent at May 27, 2016 13:02:33 Buenos Aires time, or 16:02:33 UTC. Default is account timezone
String contacts = "\"1,2,3,4\""; // String | Comma separated array of contact resources id message will be sent to
String lists = "\"1,2,3,4\""; // String | Comma separated array of list resources id message will be sent to
String phones = "\"+19993322111,+19993322110\""; // String | Comma separated array of E.164 phone numbers message will be sent to
Integer cutExtra = 0; // Integer | Should sending method cut extra characters which not fit supplied partsCount or return 400 Bad request response instead. Default is 0
Integer partsCount = 6; // Integer | Maximum message parts count (TextMagic allows sending 1 to 6 message parts). Default is 6
Integer referenceId = 1; // Integer | Custom message reference id which can be used in your application infrastructure
String from = "\"Testid1\""; // String | One of allowed Sender ID (phone number or alphanumeric sender ID). If specified Sender ID is not allowed for some destinations, a fallback default Sender ID will be used to ensure delivery
String rule = "\"FREQ=YEARLY;BYMONTH=1;BYMONTHDAY=1;COUNT=1\""; // String | iCal RRULE parameter to create recurrent scheduled messages. When used, sendingTime is mandatory as start point of sending. See https://www.textmagic.com/free-tools/rrule-generator for format details
Integer createChat = 0; // Integer | Should sending method try to create new Chat(if not exist) with specified recipients. Default is 0
Integer tts = 0; // Integer | Send Text to Speech message. Default is 0
Integer local = 0; // Integer | Treat phone numbers passed in \\'phones\\' field as local. Default is 0
String localCountry = "\"US\""; // String | 2-letter ISO country code for local phone numbers, used when \\'local\\' is set to true. Default is account country
try {
    GetMessagePreviewResponse result = apiInstance.getMessagePreview(text, templateId, sendingTime, sendingDateTime, sendingTimezone, contacts, lists, phones, cutExtra, partsCount, referenceId, from, rule, createChat, tts, local, localCountry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundMessagesApi#getMessagePreview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **String**| Message text. Required if template_id is not set | [optional]
 **templateId** | **Integer**| Template used instead of message text. Required if text is not set | [optional]
 **sendingTime** | **Integer**| DEPRECATED, consider using sendingDateTime and sendingTimezone parameters instead: Optional (required with rrule set). Message sending time in unix timestamp format. Default is now | [optional]
 **sendingDateTime** | **String**| Sending time in Y-m-d H:i:s format (e.g. 2016-05-27 13:02:33). This time is relative to sendingTimezone | [optional]
 **sendingTimezone** | **String**| ID or ISO-name of timezone used for sending when sendingDateTime parameter is set. E.g. if you specify sendingDateTime &#x3D; \\\&quot;2016-05-27 13:02:33\\\&quot; and sendingTimezone &#x3D; \\\&quot;America/Buenos_Aires\\\&quot;, your message will be sent at May 27, 2016 13:02:33 Buenos Aires time, or 16:02:33 UTC. Default is account timezone | [optional]
 **contacts** | **String**| Comma separated array of contact resources id message will be sent to | [optional]
 **lists** | **String**| Comma separated array of list resources id message will be sent to | [optional]
 **phones** | **String**| Comma separated array of E.164 phone numbers message will be sent to | [optional]
 **cutExtra** | **Integer**| Should sending method cut extra characters which not fit supplied partsCount or return 400 Bad request response instead. Default is 0 | [optional] [default to 0]
 **partsCount** | **Integer**| Maximum message parts count (TextMagic allows sending 1 to 6 message parts). Default is 6 | [optional] [default to 6]
 **referenceId** | **Integer**| Custom message reference id which can be used in your application infrastructure | [optional]
 **from** | **String**| One of allowed Sender ID (phone number or alphanumeric sender ID). If specified Sender ID is not allowed for some destinations, a fallback default Sender ID will be used to ensure delivery | [optional]
 **rule** | **String**| iCal RRULE parameter to create recurrent scheduled messages. When used, sendingTime is mandatory as start point of sending. See https://www.textmagic.com/free-tools/rrule-generator for format details | [optional]
 **createChat** | **Integer**| Should sending method try to create new Chat(if not exist) with specified recipients. Default is 0 | [optional] [default to 0]
 **tts** | **Integer**| Send Text to Speech message. Default is 0 | [optional] [default to 0]
 **local** | **Integer**| Treat phone numbers passed in \\&#39;phones\\&#39; field as local. Default is 0 | [optional] [default to 0]
 **localCountry** | **String**| 2-letter ISO country code for local phone numbers, used when \\&#39;local\\&#39; is set to true. Default is account country | [optional]

### Return type

[**GetMessagePreviewResponse**](GetMessagePreviewResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMessagePrice"></a>
# **getMessagePrice**
> GetMessagePriceResponse getMessagePrice(includeBlocked, text, templateId, sendingTime, sendingDateTime, sendingTimezone, contacts, lists, phones, cutExtra, partsCount, referenceId, from, rule, createChat, tts, local, localCountry)

Check price

Check pricing for a new outbound message.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.OutboundMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

OutboundMessagesApi apiInstance = new OutboundMessagesApi();
Integer includeBlocked = 0; // Integer | Should we show pricing for the blocked contacts.
String text = "\"Test message test\""; // String | Message text. Required if template_id is not set
Integer templateId = 1; // Integer | Template used instead of message text. Required if text is not set
Integer sendingTime = 1565606455; // Integer | DEPRECATED, consider using sendingDateTime and sendingTimezone parameters instead: Optional (required with rrule set). Message sending time in unix timestamp format. Default is now
String sendingDateTime = "\"2020-05-27 13:02:33\""; // String | Sending time in Y-m-d H:i:s format (e.g. 2016-05-27 13:02:33). This time is relative to sendingTimezone
String sendingTimezone = "\"America/Buenos_Aires\""; // String | ID or ISO-name of timezone used for sending when sendingDateTime parameter is set. E.g. if you specify sendingDateTime = \\\"2016-05-27 13:02:33\\\" and sendingTimezone = \\\"America/Buenos_Aires\\\", your message will be sent at May 27, 2016 13:02:33 Buenos Aires time, or 16:02:33 UTC. Default is account timezone
String contacts = "\"1,2,3,4\""; // String | Comma separated array of contact resources id message will be sent to
String lists = "\"1,2,3,4\""; // String | Comma separated array of list resources id message will be sent to
String phones = "\"+19993322111,+19993322110\""; // String | Comma separated array of E.164 phone numbers message will be sent to
Integer cutExtra = 0; // Integer | Should sending method cut extra characters which not fit supplied partsCount or return 400 Bad request response instead. Default is 0
Integer partsCount = 6; // Integer | Maximum message parts count (TextMagic allows sending 1 to 6 message parts). Default is 6
Integer referenceId = 1; // Integer | Custom message reference id which can be used in your application infrastructure
String from = "\"Testid1\""; // String | One of allowed Sender ID (phone number or alphanumeric sender ID). If specified Sender ID is not allowed for some destinations, a fallback default Sender ID will be used to ensure delivery
String rule = "\"FREQ=YEARLY;BYMONTH=1;BYMONTHDAY=1;COUNT=1\""; // String | iCal RRULE parameter to create recurrent scheduled messages. When used, sendingTime is mandatory as start point of sending. See https://www.textmagic.com/free-tools/rrule-generator for format details
Integer createChat = 0; // Integer | Should sending method try to create new Chat(if not exist) with specified recipients. Default is 0
Integer tts = 0; // Integer | Send Text to Speech message. Default is 0
Integer local = 0; // Integer | Treat phone numbers passed in \\'phones\\' field as local. Default is 0
String localCountry = "\"US\""; // String | 2-letter ISO country code for local phone numbers, used when \\'local\\' is set to true. Default is account country
try {
    GetMessagePriceResponse result = apiInstance.getMessagePrice(includeBlocked, text, templateId, sendingTime, sendingDateTime, sendingTimezone, contacts, lists, phones, cutExtra, partsCount, referenceId, from, rule, createChat, tts, local, localCountry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundMessagesApi#getMessagePrice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeBlocked** | **Integer**| Should we show pricing for the blocked contacts. | [optional] [default to 0]
 **text** | **String**| Message text. Required if template_id is not set | [optional]
 **templateId** | **Integer**| Template used instead of message text. Required if text is not set | [optional]
 **sendingTime** | **Integer**| DEPRECATED, consider using sendingDateTime and sendingTimezone parameters instead: Optional (required with rrule set). Message sending time in unix timestamp format. Default is now | [optional]
 **sendingDateTime** | **String**| Sending time in Y-m-d H:i:s format (e.g. 2016-05-27 13:02:33). This time is relative to sendingTimezone | [optional]
 **sendingTimezone** | **String**| ID or ISO-name of timezone used for sending when sendingDateTime parameter is set. E.g. if you specify sendingDateTime &#x3D; \\\&quot;2016-05-27 13:02:33\\\&quot; and sendingTimezone &#x3D; \\\&quot;America/Buenos_Aires\\\&quot;, your message will be sent at May 27, 2016 13:02:33 Buenos Aires time, or 16:02:33 UTC. Default is account timezone | [optional]
 **contacts** | **String**| Comma separated array of contact resources id message will be sent to | [optional]
 **lists** | **String**| Comma separated array of list resources id message will be sent to | [optional]
 **phones** | **String**| Comma separated array of E.164 phone numbers message will be sent to | [optional]
 **cutExtra** | **Integer**| Should sending method cut extra characters which not fit supplied partsCount or return 400 Bad request response instead. Default is 0 | [optional] [default to 0]
 **partsCount** | **Integer**| Maximum message parts count (TextMagic allows sending 1 to 6 message parts). Default is 6 | [optional] [default to 6]
 **referenceId** | **Integer**| Custom message reference id which can be used in your application infrastructure | [optional]
 **from** | **String**| One of allowed Sender ID (phone number or alphanumeric sender ID). If specified Sender ID is not allowed for some destinations, a fallback default Sender ID will be used to ensure delivery | [optional]
 **rule** | **String**| iCal RRULE parameter to create recurrent scheduled messages. When used, sendingTime is mandatory as start point of sending. See https://www.textmagic.com/free-tools/rrule-generator for format details | [optional]
 **createChat** | **Integer**| Should sending method try to create new Chat(if not exist) with specified recipients. Default is 0 | [optional] [default to 0]
 **tts** | **Integer**| Send Text to Speech message. Default is 0 | [optional] [default to 0]
 **local** | **Integer**| Treat phone numbers passed in \\&#39;phones\\&#39; field as local. Default is 0 | [optional] [default to 0]
 **localCountry** | **String**| 2-letter ISO country code for local phone numbers, used when \\&#39;local\\&#39; is set to true. Default is account country | [optional]

### Return type

[**GetMessagePriceResponse**](GetMessagePriceResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMessagePrices"></a>
# **getMessagePrices**
> GetMessagePricesResponse getMessagePrices()

Get pricing

Get message prices for all countries.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.OutboundMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

OutboundMessagesApi apiInstance = new OutboundMessagesApi();
try {
    GetMessagePricesResponse result = apiInstance.getMessagePrices();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundMessagesApi#getMessagePrices");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetMessagePricesResponse**](GetMessagePricesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOutboundMessage"></a>
# **getOutboundMessage**
> MessageOut getOutboundMessage(id)

Get a single message

Get a single outgoing message.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.OutboundMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

OutboundMessagesApi apiInstance = new OutboundMessagesApi();
Integer id = 1; // Integer | 
try {
    MessageOut result = apiInstance.getOutboundMessage(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundMessagesApi#getOutboundMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**MessageOut**](MessageOut.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOutboundMessagesHistory"></a>
# **getOutboundMessagesHistory**
> GetOutboundMessagesHistoryResponse getOutboundMessagesHistory(limit, lastId, query, orderBy, direction)

Get history

Get outbound messages history.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.OutboundMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

OutboundMessagesApi apiInstance = new OutboundMessagesApi();
Integer limit = 10; // Integer | How many results to return
Integer lastId = 56; // Integer | Filter results by ID, selecting all values lesser than the specified ID.
String query = "query_example"; // String | Find message by specified search query
String orderBy = "id"; // String | Order results by some field. Default is id
String direction = "desc"; // String | Order direction. Default is desc
try {
    GetOutboundMessagesHistoryResponse result = apiInstance.getOutboundMessagesHistory(limit, lastId, query, orderBy, direction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundMessagesApi#getOutboundMessagesHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| How many results to return | [optional] [default to 10]
 **lastId** | **Integer**| Filter results by ID, selecting all values lesser than the specified ID. | [optional]
 **query** | **String**| Find message by specified search query | [optional]
 **orderBy** | **String**| Order results by some field. Default is id | [optional] [default to id] [enum: id, phone, sender, firstName, lastName, messageTime]
 **direction** | **String**| Order direction. Default is desc | [optional] [default to desc] [enum: asc, desc]

### Return type

[**GetOutboundMessagesHistoryResponse**](GetOutboundMessagesHistoryResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchOutboundMessages"></a>
# **searchOutboundMessages**
> SearchOutboundMessagesResponse searchOutboundMessages(page, limit, lastId, ids, sessionId, statuses, includeDeleted, query)

Find messages

Find outbound messages by given parameters.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.OutboundMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

OutboundMessagesApi apiInstance = new OutboundMessagesApi();
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
Integer lastId = 56; // Integer | Filter results by ID, selecting all values lesser than the specified ID. Note that \\'page\\' parameter is ignored when \\'lastId\\' is specified
String ids = "ids_example"; // String | Find message by ID(s)
Integer sessionId = 56; // Integer | Find messages by session ID
String statuses = "\"q\""; // String | Find messages by status
Integer includeDeleted = 0; // Integer | Search also in deleted messages
String query = "query_example"; // String | Find messages by specified search query
try {
    SearchOutboundMessagesResponse result = apiInstance.searchOutboundMessages(page, limit, lastId, ids, sessionId, statuses, includeDeleted, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundMessagesApi#searchOutboundMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]
 **lastId** | **Integer**| Filter results by ID, selecting all values lesser than the specified ID. Note that \\&#39;page\\&#39; parameter is ignored when \\&#39;lastId\\&#39; is specified | [optional]
 **ids** | **String**| Find message by ID(s) | [optional]
 **sessionId** | **Integer**| Find messages by session ID | [optional]
 **statuses** | **String**| Find messages by status | [optional] [enum: q, s, e, r, a, d, b, f, u, j, i, p, h]
 **includeDeleted** | **Integer**| Search also in deleted messages | [optional] [default to 0]
 **query** | **String**| Find messages by specified search query | [optional]

### Return type

[**SearchOutboundMessagesResponse**](SearchOutboundMessagesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendMessage"></a>
# **sendMessage**
> SendMessageResponse sendMessage(sendMessageInputObject, xIgnoreNullValues)

Send message

The main entrypoint to send messages. See examples above for the reference.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.OutboundMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

OutboundMessagesApi apiInstance = new OutboundMessagesApi();
SendMessageInputObject sendMessageInputObject = new SendMessageInputObject(); // SendMessageInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    SendMessageResponse result = apiInstance.sendMessage(sendMessageInputObject, xIgnoreNullValues);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundMessagesApi#sendMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sendMessageInputObject** | [**SendMessageInputObject**](SendMessageInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

[**SendMessageResponse**](SendMessageResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadMessageAttachment"></a>
# **uploadMessageAttachment**
> UploadMessageAttachmentResponse uploadMessageAttachment(file)

Upload message attachment

Upload a new file to insert it as a link.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.OutboundMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

OutboundMessagesApi apiInstance = new OutboundMessagesApi();
File file = new File("/path/to/file.txt"); // File | Attachment. Supports .jpg, .gif, .png, .pdf, .txt, .csv, .doc, .docx, .xls, .xlsx, .ppt, .pptx & .vcf file formats
try {
    UploadMessageAttachmentResponse result = apiInstance.uploadMessageAttachment(file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundMessagesApi#uploadMessageAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| Attachment. Supports .jpg, .gif, .png, .pdf, .txt, .csv, .doc, .docx, .xls, .xlsx, .ppt, .pptx &amp; .vcf file formats |

### Return type

[**UploadMessageAttachmentResponse**](UploadMessageAttachmentResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

