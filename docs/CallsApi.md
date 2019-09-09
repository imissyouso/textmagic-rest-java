# CallsApi

All URIs are relative to *http://my.textmagic.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCallsPrices**](CallsApi.md#getCallsPrices) | **GET** /api/v2/calls/price | Check pricing for a inbound/outbound call.
[**getForwardedCalls**](CallsApi.md#getForwardedCalls) | **GET** /api/v2/calls | Get all forwarded calls.


<a name="getCallsPrices"></a>
# **getCallsPrices**
> Map&lt;String, Object&gt; getCallsPrices()

Check pricing for a inbound/outbound call.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.CallsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

CallsApi apiInstance = new CallsApi();
try {
    Map<String, Object> result = apiInstance.getCallsPrices();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallsApi#getCallsPrices");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getForwardedCalls"></a>
# **getForwardedCalls**
> GetForwardedCallsResponse getForwardedCalls(page, limit)

Get all forwarded calls.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.CallsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

CallsApi apiInstance = new CallsApi();
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
try {
    GetForwardedCallsResponse result = apiInstance.getForwardedCalls(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallsApi#getForwardedCalls");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]

### Return type

[**GetForwardedCallsResponse**](GetForwardedCallsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

