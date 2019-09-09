# CommonApi

All URIs are relative to *http://my.textmagic.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCountries**](CommonApi.md#getCountries) | **GET** /api/v2/countries | Return list of countries.
[**getState**](CommonApi.md#getState) | **GET** /api/v2/state | Get current entities state
[**getTimezones**](CommonApi.md#getTimezones) | **GET** /api/v2/timezones | Return all available timezone IDs.
[**getVersions**](CommonApi.md#getVersions) | **GET** /api/v2/versions | Get minimal valid apps versions
[**ping**](CommonApi.md#ping) | **GET** /api/v2/ping | Just does a pong.


<a name="getCountries"></a>
# **getCountries**
> List&lt;Country&gt; getCountries()

Return list of countries.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.CommonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

CommonApi apiInstance = new CommonApi();
try {
    List<Country> result = apiInstance.getCountries();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#getCountries");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Country&gt;**](Country.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getState"></a>
# **getState**
> GetStateResponse getState()

Get current entities state

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.CommonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

CommonApi apiInstance = new CommonApi();
try {
    GetStateResponse result = apiInstance.getState();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#getState");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetStateResponse**](GetStateResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTimezones"></a>
# **getTimezones**
> Object getTimezones(full)

Return all available timezone IDs.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.CommonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

CommonApi apiInstance = new CommonApi();
Integer full = 0; // Integer | Return full info about timezones in array (0 or 1). Default is 0
try {
    Object result = apiInstance.getTimezones(full);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#getTimezones");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **full** | **Integer**| Return full info about timezones in array (0 or 1). Default is 0 | [optional] [default to 0]

### Return type

**Object**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVersions"></a>
# **getVersions**
> GetVersionsResponse getVersions()

Get minimal valid apps versions

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.CommonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

CommonApi apiInstance = new CommonApi();
try {
    GetVersionsResponse result = apiInstance.getVersions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#getVersions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetVersionsResponse**](GetVersionsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ping"></a>
# **ping**
> PingResponse ping()

Just does a pong.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.CommonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

CommonApi apiInstance = new CommonApi();
try {
    PingResponse result = apiInstance.ping();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#ping");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PingResponse**](PingResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

