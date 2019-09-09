# ChatsApi

All URIs are relative to *http://my.textmagic.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**closeChatsBulk**](ChatsApi.md#closeChatsBulk) | **POST** /api/v2/chats/close/bulk | Close chats by chat ids or close all chats
[**closeReadChats**](ChatsApi.md#closeReadChats) | **POST** /api/v2/chats/close/read | Close all chats that have no unread messages.
[**deleteChatMessages**](ChatsApi.md#deleteChatMessages) | **POST** /api/v2/chats/{id}/messages/delete | Delete messages from chat by given messages ID(s).
[**deleteChatsBulk**](ChatsApi.md#deleteChatsBulk) | **POST** /api/v2/chats/delete | Delete chats by given ID(s) or delete all chats.
[**getAllChats**](ChatsApi.md#getAllChats) | **GET** /api/v2/chats | Get all user chats.
[**getChat**](ChatsApi.md#getChat) | **GET** /api/v2/chats/{id} | Get a single chat.
[**getChatByPhone**](ChatsApi.md#getChatByPhone) | **GET** /api/v2/chats/{phone}/by/phone | Find chats by phone.
[**getChatMessages**](ChatsApi.md#getChatMessages) | **GET** /api/v2/chats/{id}/message | Fetch messages from chat with specified chat id.
[**getUnreadMessagesTotal**](ChatsApi.md#getUnreadMessagesTotal) | **GET** /api/v2/chats/unread/count | Get total amount of unread messages in the current user chats.
[**markChatsReadBulk**](ChatsApi.md#markChatsReadBulk) | **POST** /api/v2/chats/read/bulk | Mark several chats as read by chat ids or mark all chats as read
[**markChatsUnreadBulk**](ChatsApi.md#markChatsUnreadBulk) | **POST** /api/v2/chats/unread/bulk | Mark several chats as UNread by chat ids or mark all chats as UNread
[**muteChat**](ChatsApi.md#muteChat) | **POST** /api/v2/chats/mute | Set mute mode.
[**muteChatsBulk**](ChatsApi.md#muteChatsBulk) | **POST** /api/v2/chats/mute/bulk | Mute several chats by chat ids or mute all chats
[**reopenChatsBulk**](ChatsApi.md#reopenChatsBulk) | **POST** /api/v2/chats/reopen/bulk | Reopen chats by chat ids or reopen all chats
[**searchChats**](ChatsApi.md#searchChats) | **GET** /api/v2/chats/search | Find chats by inbound or outbound messages text.
[**searchChatsByIds**](ChatsApi.md#searchChatsByIds) | **GET** /api/v2/chats/search/ids | Find chats by IDs.
[**searchChatsByReceipent**](ChatsApi.md#searchChatsByReceipent) | **GET** /api/v2/chats/search/recipients | Find chats by recipient (contact, list name or phone number).
[**setChatStatus**](ChatsApi.md#setChatStatus) | **POST** /api/v2/chats/status | Set status of the chat given by ID.
[**unmuteChatsBulk**](ChatsApi.md#unmuteChatsBulk) | **POST** /api/v2/chats/unmute/bulk | Unmute several chats by chat ids or unmute all chats


<a name="closeChatsBulk"></a>
# **closeChatsBulk**
> closeChatsBulk(closeChatsBulkInputObject, xIgnoreNullValues)

Close chats by chat ids or close all chats

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ChatsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ChatsApi apiInstance = new ChatsApi();
CloseChatsBulkInputObject closeChatsBulkInputObject = new CloseChatsBulkInputObject(); // CloseChatsBulkInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    apiInstance.closeChatsBulk(closeChatsBulkInputObject, xIgnoreNullValues);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatsApi#closeChatsBulk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **closeChatsBulkInputObject** | [**CloseChatsBulkInputObject**](CloseChatsBulkInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="closeReadChats"></a>
# **closeReadChats**
> closeReadChats()

Close all chats that have no unread messages.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ChatsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ChatsApi apiInstance = new ChatsApi();
try {
    apiInstance.closeReadChats();
} catch (ApiException e) {
    System.err.println("Exception when calling ChatsApi#closeReadChats");
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

<a name="deleteChatMessages"></a>
# **deleteChatMessages**
> deleteChatMessages(deleteChatMessagesBulkInputObject, id, xIgnoreNullValues)

Delete messages from chat by given messages ID(s).

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ChatsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ChatsApi apiInstance = new ChatsApi();
DeleteChatMessagesBulkInputObject deleteChatMessagesBulkInputObject = new DeleteChatMessagesBulkInputObject(); // DeleteChatMessagesBulkInputObject | 
Integer id = 1; // Integer | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    apiInstance.deleteChatMessages(deleteChatMessagesBulkInputObject, id, xIgnoreNullValues);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatsApi#deleteChatMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteChatMessagesBulkInputObject** | [**DeleteChatMessagesBulkInputObject**](DeleteChatMessagesBulkInputObject.md)|  |
 **id** | **Integer**|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteChatsBulk"></a>
# **deleteChatsBulk**
> deleteChatsBulk(deleteChatsBulkInputObject, xIgnoreNullValues)

Delete chats by given ID(s) or delete all chats.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ChatsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ChatsApi apiInstance = new ChatsApi();
DeleteChatsBulkInputObject deleteChatsBulkInputObject = new DeleteChatsBulkInputObject(); // DeleteChatsBulkInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    apiInstance.deleteChatsBulk(deleteChatsBulkInputObject, xIgnoreNullValues);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatsApi#deleteChatsBulk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteChatsBulkInputObject** | [**DeleteChatsBulkInputObject**](DeleteChatsBulkInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getAllChats"></a>
# **getAllChats**
> GetAllChatsResponse getAllChats(status, page, limit, orderBy, voice, flat)

Get all user chats.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ChatsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ChatsApi apiInstance = new ChatsApi();
String status = "status_example"; // String | Fetch only (a)ctive, (c)losed or (d)eleted chats
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
String orderBy = "id"; // String | Order results by some field. Default is id
Integer voice = 0; // Integer | Fetch results with voice calls
Integer flat = 0; // Integer | Should additional contact info be included
try {
    GetAllChatsResponse result = apiInstance.getAllChats(status, page, limit, orderBy, voice, flat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatsApi#getAllChats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **String**| Fetch only (a)ctive, (c)losed or (d)eleted chats | [optional] [enum: a, c, d]
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]
 **orderBy** | **String**| Order results by some field. Default is id | [optional] [default to id] [enum: id, unread, messageTime]
 **voice** | **Integer**| Fetch results with voice calls | [optional] [default to 0]
 **flat** | **Integer**| Should additional contact info be included | [optional] [default to 0]

### Return type

[**GetAllChatsResponse**](GetAllChatsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChat"></a>
# **getChat**
> Chat getChat(id)

Get a single chat.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ChatsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ChatsApi apiInstance = new ChatsApi();
Integer id = 1; // Integer | 
try {
    Chat result = apiInstance.getChat(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatsApi#getChat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**Chat**](Chat.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChatByPhone"></a>
# **getChatByPhone**
> Chat getChatByPhone(phone, upsert, reopen)

Find chats by phone.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ChatsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ChatsApi apiInstance = new ChatsApi();
String phone = "phone_example"; // String | 
Integer upsert = 0; // Integer | Create a new chat if not found
Integer reopen = 0; // Integer | Reopen chat if found or do not change status
try {
    Chat result = apiInstance.getChatByPhone(phone, upsert, reopen);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatsApi#getChatByPhone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone** | **String**|  |
 **upsert** | **Integer**| Create a new chat if not found | [optional] [default to 0]
 **reopen** | **Integer**| Reopen chat if found or do not change status | [optional] [default to 0]

### Return type

[**Chat**](Chat.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChatMessages"></a>
# **getChatMessages**
> GetChatMessagesResponse getChatMessages(id, page, limit, query, start, end, direction, voice)

Fetch messages from chat with specified chat id.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ChatsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ChatsApi apiInstance = new ChatsApi();
Integer id = 1; // Integer | 
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
String query = "query_example"; // String | Find messages by specified search query
Integer start = 56; // Integer | Return messages since specified timestamp only
Integer end = 56; // Integer | Return messages up to specified timestamp only
String direction = "desc"; // String | Order direction. Default is desc
Integer voice = 0; // Integer | Fetch results with voice calls
try {
    GetChatMessagesResponse result = apiInstance.getChatMessages(id, page, limit, query, start, end, direction, voice);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatsApi#getChatMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]
 **query** | **String**| Find messages by specified search query | [optional]
 **start** | **Integer**| Return messages since specified timestamp only | [optional]
 **end** | **Integer**| Return messages up to specified timestamp only | [optional]
 **direction** | **String**| Order direction. Default is desc | [optional] [default to desc] [enum: asc, desc]
 **voice** | **Integer**| Fetch results with voice calls | [optional] [default to 0]

### Return type

[**GetChatMessagesResponse**](GetChatMessagesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUnreadMessagesTotal"></a>
# **getUnreadMessagesTotal**
> GetUnreadMessagesTotalResponse getUnreadMessagesTotal()

Get total amount of unread messages in the current user chats.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ChatsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ChatsApi apiInstance = new ChatsApi();
try {
    GetUnreadMessagesTotalResponse result = apiInstance.getUnreadMessagesTotal();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatsApi#getUnreadMessagesTotal");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetUnreadMessagesTotalResponse**](GetUnreadMessagesTotalResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="markChatsReadBulk"></a>
# **markChatsReadBulk**
> markChatsReadBulk(markChatsReadBulkInputObject, xIgnoreNullValues)

Mark several chats as read by chat ids or mark all chats as read

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ChatsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ChatsApi apiInstance = new ChatsApi();
MarkChatsReadBulkInputObject markChatsReadBulkInputObject = new MarkChatsReadBulkInputObject(); // MarkChatsReadBulkInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    apiInstance.markChatsReadBulk(markChatsReadBulkInputObject, xIgnoreNullValues);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatsApi#markChatsReadBulk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **markChatsReadBulkInputObject** | [**MarkChatsReadBulkInputObject**](MarkChatsReadBulkInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="markChatsUnreadBulk"></a>
# **markChatsUnreadBulk**
> markChatsUnreadBulk(markChatsUnreadBulkInputObject, xIgnoreNullValues)

Mark several chats as UNread by chat ids or mark all chats as UNread

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ChatsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ChatsApi apiInstance = new ChatsApi();
MarkChatsUnreadBulkInputObject markChatsUnreadBulkInputObject = new MarkChatsUnreadBulkInputObject(); // MarkChatsUnreadBulkInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    apiInstance.markChatsUnreadBulk(markChatsUnreadBulkInputObject, xIgnoreNullValues);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatsApi#markChatsUnreadBulk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **markChatsUnreadBulkInputObject** | [**MarkChatsUnreadBulkInputObject**](MarkChatsUnreadBulkInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="muteChat"></a>
# **muteChat**
> ResourceLinkResponse muteChat(muteChatInputObject, xIgnoreNullValues)

Set mute mode.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ChatsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ChatsApi apiInstance = new ChatsApi();
MuteChatInputObject muteChatInputObject = new MuteChatInputObject(); // MuteChatInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    ResourceLinkResponse result = apiInstance.muteChat(muteChatInputObject, xIgnoreNullValues);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatsApi#muteChat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **muteChatInputObject** | [**MuteChatInputObject**](MuteChatInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="muteChatsBulk"></a>
# **muteChatsBulk**
> muteChatsBulk(muteChatsBulkInputObject, xIgnoreNullValues)

Mute several chats by chat ids or mute all chats

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ChatsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ChatsApi apiInstance = new ChatsApi();
MuteChatsBulkInputObject muteChatsBulkInputObject = new MuteChatsBulkInputObject(); // MuteChatsBulkInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    apiInstance.muteChatsBulk(muteChatsBulkInputObject, xIgnoreNullValues);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatsApi#muteChatsBulk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **muteChatsBulkInputObject** | [**MuteChatsBulkInputObject**](MuteChatsBulkInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="reopenChatsBulk"></a>
# **reopenChatsBulk**
> reopenChatsBulk(reopenChatsBulkInputObject, xIgnoreNullValues)

Reopen chats by chat ids or reopen all chats

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ChatsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ChatsApi apiInstance = new ChatsApi();
ReopenChatsBulkInputObject reopenChatsBulkInputObject = new ReopenChatsBulkInputObject(); // ReopenChatsBulkInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    apiInstance.reopenChatsBulk(reopenChatsBulkInputObject, xIgnoreNullValues);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatsApi#reopenChatsBulk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reopenChatsBulkInputObject** | [**ReopenChatsBulkInputObject**](ReopenChatsBulkInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="searchChats"></a>
# **searchChats**
> SearchChatsResponse searchChats(page, limit, query)

Find chats by inbound or outbound messages text.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ChatsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ChatsApi apiInstance = new ChatsApi();
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
String query = "query_example"; // String | Find chats by specified search query
try {
    SearchChatsResponse result = apiInstance.searchChats(page, limit, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatsApi#searchChats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]
 **query** | **String**| Find chats by specified search query | [optional]

### Return type

[**SearchChatsResponse**](SearchChatsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchChatsByIds"></a>
# **searchChatsByIds**
> SearchChatsByIdsResponse searchChatsByIds(page, limit, ids)

Find chats by IDs.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ChatsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ChatsApi apiInstance = new ChatsApi();
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
String ids = "ids_example"; // String | Find chats by ID(s)
try {
    SearchChatsByIdsResponse result = apiInstance.searchChatsByIds(page, limit, ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatsApi#searchChatsByIds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]
 **ids** | **String**| Find chats by ID(s) | [optional]

### Return type

[**SearchChatsByIdsResponse**](SearchChatsByIdsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchChatsByReceipent"></a>
# **searchChatsByReceipent**
> SearchChatsByReceipentResponse searchChatsByReceipent(page, limit, query, orderBy)

Find chats by recipient (contact, list name or phone number).

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ChatsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ChatsApi apiInstance = new ChatsApi();
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
String query = "query_example"; // String | Find chats by specified search query
String orderBy = "id"; // String | Order results by some field. Default is id
try {
    SearchChatsByReceipentResponse result = apiInstance.searchChatsByReceipent(page, limit, query, orderBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatsApi#searchChatsByReceipent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]
 **query** | **String**| Find chats by specified search query | [optional]
 **orderBy** | **String**| Order results by some field. Default is id | [optional] [default to id] [enum: id, unread, messageTime]

### Return type

[**SearchChatsByReceipentResponse**](SearchChatsByReceipentResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setChatStatus"></a>
# **setChatStatus**
> ResourceLinkResponse setChatStatus(setChatStatusInputObject, xIgnoreNullValues)

Set status of the chat given by ID.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ChatsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ChatsApi apiInstance = new ChatsApi();
SetChatStatusInputObject setChatStatusInputObject = new SetChatStatusInputObject(); // SetChatStatusInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    ResourceLinkResponse result = apiInstance.setChatStatus(setChatStatusInputObject, xIgnoreNullValues);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatsApi#setChatStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **setChatStatusInputObject** | [**SetChatStatusInputObject**](SetChatStatusInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unmuteChatsBulk"></a>
# **unmuteChatsBulk**
> unmuteChatsBulk(unmuteChatsBulkInputObject, xIgnoreNullValues)

Unmute several chats by chat ids or unmute all chats

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ChatsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ChatsApi apiInstance = new ChatsApi();
UnmuteChatsBulkInputObject unmuteChatsBulkInputObject = new UnmuteChatsBulkInputObject(); // UnmuteChatsBulkInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    apiInstance.unmuteChatsBulk(unmuteChatsBulkInputObject, xIgnoreNullValues);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatsApi#unmuteChatsBulk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unmuteChatsBulkInputObject** | [**UnmuteChatsBulkInputObject**](UnmuteChatsBulkInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

