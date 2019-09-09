# ScheduledMessagesApi

All URIs are relative to *http://my.textmagic.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteScheduledMessage**](ScheduledMessagesApi.md#deleteScheduledMessage) | **DELETE** /api/v2/schedules/{id} | Delete a message session, together with all nested messages.
[**deleteScheduledMessagesBulk**](ScheduledMessagesApi.md#deleteScheduledMessagesBulk) | **POST** /api/v2/schedules/delete | Delete scheduled messages by given ID(s) or delete all scheduled messages.
[**getAllScheduledMessages**](ScheduledMessagesApi.md#getAllScheduledMessages) | **GET** /api/v2/schedules | Get all scheduled messages.
[**getScheduledMessage**](ScheduledMessagesApi.md#getScheduledMessage) | **GET** /api/v2/schedules/{id} | Get message schedule.
[**searchScheduledMessages**](ScheduledMessagesApi.md#searchScheduledMessages) | **GET** /api/v2/schedules/search | Find scheduled messages by given parameters.


<a name="deleteScheduledMessage"></a>
# **deleteScheduledMessage**
> deleteScheduledMessage(id)

Delete a message session, together with all nested messages.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ScheduledMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ScheduledMessagesApi apiInstance = new ScheduledMessagesApi();
Integer id = 1; // Integer | 
try {
    apiInstance.deleteScheduledMessage(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledMessagesApi#deleteScheduledMessage");
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

<a name="deleteScheduledMessagesBulk"></a>
# **deleteScheduledMessagesBulk**
> deleteScheduledMessagesBulk(deleteScheduledMessagesBulkInputObject, xIgnoreNullValues)

Delete scheduled messages by given ID(s) or delete all scheduled messages.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ScheduledMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ScheduledMessagesApi apiInstance = new ScheduledMessagesApi();
DeleteScheduledMessagesBulkInputObject deleteScheduledMessagesBulkInputObject = new DeleteScheduledMessagesBulkInputObject(); // DeleteScheduledMessagesBulkInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    apiInstance.deleteScheduledMessagesBulk(deleteScheduledMessagesBulkInputObject, xIgnoreNullValues);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledMessagesApi#deleteScheduledMessagesBulk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteScheduledMessagesBulkInputObject** | [**DeleteScheduledMessagesBulkInputObject**](DeleteScheduledMessagesBulkInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getAllScheduledMessages"></a>
# **getAllScheduledMessages**
> GetAllScheduledMessagesResponse getAllScheduledMessages(page, limit, status, orderBy, direction)

Get all scheduled messages.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ScheduledMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ScheduledMessagesApi apiInstance = new ScheduledMessagesApi();
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
String status = "x"; // String | Fetch schedules with the specific status: a - actual, c - completed, x - all
String orderBy = "id"; // String | Order results by some field. Default is id
String direction = "desc"; // String | Order direction. Default is desc
try {
    GetAllScheduledMessagesResponse result = apiInstance.getAllScheduledMessages(page, limit, status, orderBy, direction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledMessagesApi#getAllScheduledMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]
 **status** | **String**| Fetch schedules with the specific status: a - actual, c - completed, x - all | [optional] [default to x] [enum: a, c, x]
 **orderBy** | **String**| Order results by some field. Default is id | [optional] [default to id] [enum: id, nextSend, lastSend]
 **direction** | **String**| Order direction. Default is desc | [optional] [default to desc] [enum: asc, desc]

### Return type

[**GetAllScheduledMessagesResponse**](GetAllScheduledMessagesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getScheduledMessage"></a>
# **getScheduledMessage**
> MessagesIcs getScheduledMessage(id)

Get message schedule.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ScheduledMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ScheduledMessagesApi apiInstance = new ScheduledMessagesApi();
Integer id = 1; // Integer | 
try {
    MessagesIcs result = apiInstance.getScheduledMessage(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledMessagesApi#getScheduledMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**MessagesIcs**](MessagesIcs.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchScheduledMessages"></a>
# **searchScheduledMessages**
> SearchScheduledMessagesResponse searchScheduledMessages(page, limit, query, ids, status, orderBy, direction)

Find scheduled messages by given parameters.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ScheduledMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ScheduledMessagesApi apiInstance = new ScheduledMessagesApi();
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
String query = "query_example"; // String | Find messages by specified search query
String ids = "ids_example"; // String | Find schedules by ID(s)
String status = "x"; // String | Fetch schedules with the specific status: a - actual, c - completed, x - all
String orderBy = "id"; // String | Order results by some field. Default is id
String direction = "desc"; // String | Order direction. Default is desc
try {
    SearchScheduledMessagesResponse result = apiInstance.searchScheduledMessages(page, limit, query, ids, status, orderBy, direction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledMessagesApi#searchScheduledMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]
 **query** | **String**| Find messages by specified search query | [optional]
 **ids** | **String**| Find schedules by ID(s) | [optional]
 **status** | **String**| Fetch schedules with the specific status: a - actual, c - completed, x - all | [optional] [default to x] [enum: x, a, c]
 **orderBy** | **String**| Order results by some field. Default is id | [optional] [default to id] [enum: id, nextSend, lastSend]
 **direction** | **String**| Order direction. Default is desc | [optional] [default to desc] [enum: asc, desc]

### Return type

[**SearchScheduledMessagesResponse**](SearchScheduledMessagesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

