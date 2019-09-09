# OutboundMessageSessionsApi

All URIs are relative to *http://my.textmagic.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMessageSession**](OutboundMessageSessionsApi.md#deleteMessageSession) | **DELETE** /api/v2/sessions/{id} | Delete a message session, together with all nested messages.
[**deleteMessageSessionsBulk**](OutboundMessageSessionsApi.md#deleteMessageSessionsBulk) | **POST** /api/v2/sessions/delete | Delete messages sessions, together with all nested messages, by given ID(s) or delete all messages sessions.
[**getAllMessageSessions**](OutboundMessageSessionsApi.md#getAllMessageSessions) | **GET** /api/v2/sessions | Get all message sending sessions.
[**getMessageSession**](OutboundMessageSessionsApi.md#getMessageSession) | **GET** /api/v2/sessions/{id} | Get a message session.
[**getMessageSessionStat**](OutboundMessageSessionsApi.md#getMessageSessionStat) | **GET** /api/v2/sessions/{id}/stat | Get sending session statistics.
[**getMessagesBySessionId**](OutboundMessageSessionsApi.md#getMessagesBySessionId) | **GET** /api/v2/sessions/{id}/messages | Fetch messages by given session id.


<a name="deleteMessageSession"></a>
# **deleteMessageSession**
> deleteMessageSession(id)

Delete a message session, together with all nested messages.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.OutboundMessageSessionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

OutboundMessageSessionsApi apiInstance = new OutboundMessageSessionsApi();
Integer id = 1; // Integer | 
try {
    apiInstance.deleteMessageSession(id);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundMessageSessionsApi#deleteMessageSession");
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

<a name="deleteMessageSessionsBulk"></a>
# **deleteMessageSessionsBulk**
> deleteMessageSessionsBulk(deleteMessageSessionsBulkInputObject, xIgnoreNullValues)

Delete messages sessions, together with all nested messages, by given ID(s) or delete all messages sessions.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.OutboundMessageSessionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

OutboundMessageSessionsApi apiInstance = new OutboundMessageSessionsApi();
DeleteMessageSessionsBulkInputObject deleteMessageSessionsBulkInputObject = new DeleteMessageSessionsBulkInputObject(); // DeleteMessageSessionsBulkInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    apiInstance.deleteMessageSessionsBulk(deleteMessageSessionsBulkInputObject, xIgnoreNullValues);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundMessageSessionsApi#deleteMessageSessionsBulk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteMessageSessionsBulkInputObject** | [**DeleteMessageSessionsBulkInputObject**](DeleteMessageSessionsBulkInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getAllMessageSessions"></a>
# **getAllMessageSessions**
> GetAllMessageSessionsResponse getAllMessageSessions(page, limit)

Get all message sending sessions.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.OutboundMessageSessionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

OutboundMessageSessionsApi apiInstance = new OutboundMessageSessionsApi();
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
try {
    GetAllMessageSessionsResponse result = apiInstance.getAllMessageSessions(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundMessageSessionsApi#getAllMessageSessions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]

### Return type

[**GetAllMessageSessionsResponse**](GetAllMessageSessionsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMessageSession"></a>
# **getMessageSession**
> MessageSession getMessageSession(id)

Get a message session.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.OutboundMessageSessionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

OutboundMessageSessionsApi apiInstance = new OutboundMessageSessionsApi();
Integer id = 1; // Integer | 
try {
    MessageSession result = apiInstance.getMessageSession(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundMessageSessionsApi#getMessageSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**MessageSession**](MessageSession.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMessageSessionStat"></a>
# **getMessageSessionStat**
> GetMessageSessionStatResponse getMessageSessionStat(id, includeDeleted)

Get sending session statistics.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.OutboundMessageSessionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

OutboundMessageSessionsApi apiInstance = new OutboundMessageSessionsApi();
Integer id = 1; // Integer | 
Integer includeDeleted = 0; // Integer | Search also in deleted messages
try {
    GetMessageSessionStatResponse result = apiInstance.getMessageSessionStat(id, includeDeleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundMessageSessionsApi#getMessageSessionStat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **includeDeleted** | **Integer**| Search also in deleted messages | [optional] [default to 0]

### Return type

[**GetMessageSessionStatResponse**](GetMessageSessionStatResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMessagesBySessionId"></a>
# **getMessagesBySessionId**
> GetMessagesBySessionIdResponse getMessagesBySessionId(id, page, limit, statuses, includeDeleted)

Fetch messages by given session id.

A useful synonym for \&quot;messages/search\&quot; command with provided \&quot;sessionId\&quot; parameter.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.OutboundMessageSessionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

OutboundMessageSessionsApi apiInstance = new OutboundMessageSessionsApi();
Integer id = 1; // Integer | 
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
String statuses = "statuses_example"; // String | Find messages by status
Integer includeDeleted = 0; // Integer | Search also in deleted messages
try {
    GetMessagesBySessionIdResponse result = apiInstance.getMessagesBySessionId(id, page, limit, statuses, includeDeleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundMessageSessionsApi#getMessagesBySessionId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]
 **statuses** | **String**| Find messages by status | [optional] [enum: q, s, e, r, a, d, b, f, u, j, i, p, h]
 **includeDeleted** | **Integer**| Search also in deleted messages | [optional] [default to 0]

### Return type

[**GetMessagesBySessionIdResponse**](GetMessagesBySessionIdResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

