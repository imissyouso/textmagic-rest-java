# BulkMessageSessionsApi

All URIs are relative to *http://my.textmagic.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllBulkSessions**](BulkMessageSessionsApi.md#getAllBulkSessions) | **GET** /api/v2/bulks | Get all bulk sending sessions.
[**getBulkSession**](BulkMessageSessionsApi.md#getBulkSession) | **GET** /api/v2/bulks/{id} | Get bulk message session status.


<a name="getAllBulkSessions"></a>
# **getAllBulkSessions**
> GetAllBulkSessionsResponse getAllBulkSessions(page, limit)

Get all bulk sending sessions.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.BulkMessageSessionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

BulkMessageSessionsApi apiInstance = new BulkMessageSessionsApi();
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
try {
    GetAllBulkSessionsResponse result = apiInstance.getAllBulkSessions(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BulkMessageSessionsApi#getAllBulkSessions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]

### Return type

[**GetAllBulkSessionsResponse**](GetAllBulkSessionsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBulkSession"></a>
# **getBulkSession**
> BulkSession getBulkSession(id)

Get bulk message session status.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.BulkMessageSessionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

BulkMessageSessionsApi apiInstance = new BulkMessageSessionsApi();
Integer id = 1; // Integer | 
try {
    BulkSession result = apiInstance.getBulkSession(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BulkMessageSessionsApi#getBulkSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**BulkSession**](BulkSession.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

