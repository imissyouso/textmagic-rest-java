# ToolsApi

All URIs are relative to *http://my.textmagic.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**doCarrierLookup**](ToolsApi.md#doCarrierLookup) | **GET** /api/v2/lookups/{phone} | Carrier Lookup
[**doEmailLookup**](ToolsApi.md#doEmailLookup) | **GET** /api/v2/email-lookups/{email} | Validate Email address using Email Lookup tool


<a name="doCarrierLookup"></a>
# **doCarrierLookup**
> DoCarrierLookupResponse doCarrierLookup(phone, country)

Carrier Lookup

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ToolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ToolsApi apiInstance = new ToolsApi();
String phone = "\"1-541-754-3010\""; // String | 
String country = "US"; // String | Country code for local formatted numbers
try {
    DoCarrierLookupResponse result = apiInstance.doCarrierLookup(phone, country);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToolsApi#doCarrierLookup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone** | **String**|  |
 **country** | **String**| Country code for local formatted numbers | [optional] [default to US]

### Return type

[**DoCarrierLookupResponse**](DoCarrierLookupResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="doEmailLookup"></a>
# **doEmailLookup**
> DoEmailLookupResponse doEmailLookup(email)

Validate Email address using Email Lookup tool

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ToolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ToolsApi apiInstance = new ToolsApi();
String email = "\"andrey.v@textmagic.biz\""; // String | 
try {
    DoEmailLookupResponse result = apiInstance.doEmailLookup(email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToolsApi#doEmailLookup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**|  |

### Return type

[**DoEmailLookupResponse**](DoEmailLookupResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

