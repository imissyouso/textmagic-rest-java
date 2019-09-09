# InboundMessagesApi

All URIs are relative to *http://my.textmagic.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteInboundMessage**](InboundMessagesApi.md#deleteInboundMessage) | **DELETE** /api/v2/replies/{id} | Delete the incoming message.
[**deleteInboundMessagesBulk**](InboundMessagesApi.md#deleteInboundMessagesBulk) | **POST** /api/v2/replies/delete | Delete inbound messages by given ID(s) or delete all inbound messages.
[**getAllInboundMessages**](InboundMessagesApi.md#getAllInboundMessages) | **GET** /api/v2/replies | Get all inbox messages.
[**getInboundMessage**](InboundMessagesApi.md#getInboundMessage) | **GET** /api/v2/replies/{id} | Get a single inbox message.
[**searchInboundMessages**](InboundMessagesApi.md#searchInboundMessages) | **GET** /api/v2/replies/search | Find inbound messages by given parameters.


<a name="deleteInboundMessage"></a>
# **deleteInboundMessage**
> deleteInboundMessage(id)

Delete the incoming message.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.InboundMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

InboundMessagesApi apiInstance = new InboundMessagesApi();
Integer id = 1; // Integer | 
try {
    apiInstance.deleteInboundMessage(id);
} catch (ApiException e) {
    System.err.println("Exception when calling InboundMessagesApi#deleteInboundMessage");
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

<a name="deleteInboundMessagesBulk"></a>
# **deleteInboundMessagesBulk**
> deleteInboundMessagesBulk(deleteInboundMessagesBulkInputObject, xIgnoreNullValues)

Delete inbound messages by given ID(s) or delete all inbound messages.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.InboundMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

InboundMessagesApi apiInstance = new InboundMessagesApi();
DeleteInboundMessagesBulkInputObject deleteInboundMessagesBulkInputObject = new DeleteInboundMessagesBulkInputObject(); // DeleteInboundMessagesBulkInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    apiInstance.deleteInboundMessagesBulk(deleteInboundMessagesBulkInputObject, xIgnoreNullValues);
} catch (ApiException e) {
    System.err.println("Exception when calling InboundMessagesApi#deleteInboundMessagesBulk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteInboundMessagesBulkInputObject** | [**DeleteInboundMessagesBulkInputObject**](DeleteInboundMessagesBulkInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getAllInboundMessages"></a>
# **getAllInboundMessages**
> GetAllInboundMessagesResponse getAllInboundMessages(page, limit, orderBy, direction)

Get all inbox messages.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.InboundMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

InboundMessagesApi apiInstance = new InboundMessagesApi();
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
String orderBy = "id"; // String | Order results by some field. Default is id
String direction = "desc"; // String | Order direction. Default is desc
try {
    GetAllInboundMessagesResponse result = apiInstance.getAllInboundMessages(page, limit, orderBy, direction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InboundMessagesApi#getAllInboundMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]
 **orderBy** | **String**| Order results by some field. Default is id | [optional] [default to id] [enum: id, sender, receiver, messageTime, firstName, lastName]
 **direction** | **String**| Order direction. Default is desc | [optional] [default to desc] [enum: asc, desc]

### Return type

[**GetAllInboundMessagesResponse**](GetAllInboundMessagesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInboundMessage"></a>
# **getInboundMessage**
> MessageIn getInboundMessage(id)

Get a single inbox message.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.InboundMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

InboundMessagesApi apiInstance = new InboundMessagesApi();
Integer id = 1; // Integer | 
try {
    MessageIn result = apiInstance.getInboundMessage(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InboundMessagesApi#getInboundMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**MessageIn**](MessageIn.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchInboundMessages"></a>
# **searchInboundMessages**
> SearchInboundMessagesResponse searchInboundMessages(page, limit, ids, query, orderBy, direction, expand)

Find inbound messages by given parameters.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.InboundMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

InboundMessagesApi apiInstance = new InboundMessagesApi();
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
String ids = "ids_example"; // String | Find message by ID(s)
String query = "query_example"; // String | Find recipients by specified search query
String orderBy = "id"; // String | Order results by some field. Default is id
String direction = "desc"; // String | Order direction. Default is desc
Integer expand = 0; // Integer | Expand by adding firstName, lastName and contactId
try {
    SearchInboundMessagesResponse result = apiInstance.searchInboundMessages(page, limit, ids, query, orderBy, direction, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InboundMessagesApi#searchInboundMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]
 **ids** | **String**| Find message by ID(s) | [optional]
 **query** | **String**| Find recipients by specified search query | [optional]
 **orderBy** | **String**| Order results by some field. Default is id | [optional] [default to id] [enum: id, sender, receiver, messageTime, firstName, lastName]
 **direction** | **String**| Order direction. Default is desc | [optional] [default to desc] [enum: asc, desc]
 **expand** | **Integer**| Expand by adding firstName, lastName and contactId | [optional] [default to 0]

### Return type

[**SearchInboundMessagesResponse**](SearchInboundMessagesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

