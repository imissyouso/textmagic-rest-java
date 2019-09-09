# IntegrationApi

All URIs are relative to *http://my.textmagic.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPushToken**](IntegrationApi.md#createPushToken) | **POST** /api/v2/push/tokens | Add or update a device token.
[**deletePushToken**](IntegrationApi.md#deletePushToken) | **DELETE** /api/v2/push/tokens/{type}/{deviceId} | Delete a push notification device token.
[**getPushTokens**](IntegrationApi.md#getPushTokens) | **GET** /api/v2/push/tokens | Get all device tokens assigned to the current account


<a name="createPushToken"></a>
# **createPushToken**
> createPushToken(createPushTokenInputObject, xIgnoreNullValues)

Add or update a device token.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.IntegrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

IntegrationApi apiInstance = new IntegrationApi();
CreatePushTokenInputObject createPushTokenInputObject = new CreatePushTokenInputObject(); // CreatePushTokenInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    apiInstance.createPushToken(createPushTokenInputObject, xIgnoreNullValues);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#createPushToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createPushTokenInputObject** | [**CreatePushTokenInputObject**](CreatePushTokenInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePushToken"></a>
# **deletePushToken**
> deletePushToken(type, deviceId)

Delete a push notification device token.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.IntegrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

IntegrationApi apiInstance = new IntegrationApi();
String type = "type_example"; // String | 
Integer deviceId = 56; // Integer | 
try {
    apiInstance.deletePushToken(type, deviceId);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#deletePushToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**|  |
 **deviceId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getPushTokens"></a>
# **getPushTokens**
> GetPushTokensResponse getPushTokens()

Get all device tokens assigned to the current account

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.IntegrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

IntegrationApi apiInstance = new IntegrationApi();
try {
    GetPushTokensResponse result = apiInstance.getPushTokens();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#getPushTokens");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetPushTokensResponse**](GetPushTokensResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

