# UserSettingsApi

All URIs are relative to *http://my.textmagic.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAvailableSenderSettingOptions**](UserSettingsApi.md#getAvailableSenderSettingOptions) | **GET** /api/v2/sources | Get all available sender setting options which could be used in \&quot;from\&quot; parameter of POST messages method.
[**getBalanceNotificationOptions**](UserSettingsApi.md#getBalanceNotificationOptions) | **GET** /api/v2/user/notification/balance/bundles | Returns the list of available balance options which can be used as a bound to determine when to send email to user with low balance notification. See https://my.textmagic.com/online/account/notifications/balance
[**getBalanceNotificationSettings**](UserSettingsApi.md#getBalanceNotificationSettings) | **GET** /api/v2/user/notification/balance | Get balance notification settings
[**getCallbackSettings**](UserSettingsApi.md#getCallbackSettings) | **GET** /api/v2/callback/settings | Fetch callback URL settings
[**getInboundMessagesNotificationSettings**](UserSettingsApi.md#getInboundMessagesNotificationSettings) | **GET** /api/v2/user/notification/inbound | Get inbound messages notification settings
[**updateBalanceNotificationSettings**](UserSettingsApi.md#updateBalanceNotificationSettings) | **PUT** /api/v2/user/notification/balance | Update balance notification settings
[**updateCallbackSettings**](UserSettingsApi.md#updateCallbackSettings) | **PUT** /api/v2/callback/settings | Update callback URL settings
[**updateChatDesktopNotificationSettings**](UserSettingsApi.md#updateChatDesktopNotificationSettings) | **PUT** /api/v2/user/desktop/notification | Update chat desktop notification settings
[**updateInboundMessagesNotificationSettings**](UserSettingsApi.md#updateInboundMessagesNotificationSettings) | **PUT** /api/v2/user/notification/inbound | Update inbound messages notification settings


<a name="getAvailableSenderSettingOptions"></a>
# **getAvailableSenderSettingOptions**
> GetAvailableSenderSettingOptionsResponse getAvailableSenderSettingOptions(country)

Get all available sender setting options which could be used in \&quot;from\&quot; parameter of POST messages method.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.UserSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UserSettingsApi apiInstance = new UserSettingsApi();
String country = "country_example"; // String | Return sender setting options available in specific country only. Two upper case characters
try {
    GetAvailableSenderSettingOptionsResponse result = apiInstance.getAvailableSenderSettingOptions(country);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserSettingsApi#getAvailableSenderSettingOptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **String**| Return sender setting options available in specific country only. Two upper case characters | [optional]

### Return type

[**GetAvailableSenderSettingOptionsResponse**](GetAvailableSenderSettingOptionsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBalanceNotificationOptions"></a>
# **getBalanceNotificationOptions**
> GetBalanceNotificationOptionsResponse getBalanceNotificationOptions()

Returns the list of available balance options which can be used as a bound to determine when to send email to user with low balance notification. See https://my.textmagic.com/online/account/notifications/balance

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.UserSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UserSettingsApi apiInstance = new UserSettingsApi();
try {
    GetBalanceNotificationOptionsResponse result = apiInstance.getBalanceNotificationOptions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserSettingsApi#getBalanceNotificationOptions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetBalanceNotificationOptionsResponse**](GetBalanceNotificationOptionsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBalanceNotificationSettings"></a>
# **getBalanceNotificationSettings**
> GetBalanceNotificationSettingsResponse getBalanceNotificationSettings()

Get balance notification settings

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.UserSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UserSettingsApi apiInstance = new UserSettingsApi();
try {
    GetBalanceNotificationSettingsResponse result = apiInstance.getBalanceNotificationSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserSettingsApi#getBalanceNotificationSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetBalanceNotificationSettingsResponse**](GetBalanceNotificationSettingsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCallbackSettings"></a>
# **getCallbackSettings**
> GetCallbackSettingsResponse getCallbackSettings()

Fetch callback URL settings

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.UserSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UserSettingsApi apiInstance = new UserSettingsApi();
try {
    GetCallbackSettingsResponse result = apiInstance.getCallbackSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserSettingsApi#getCallbackSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetCallbackSettingsResponse**](GetCallbackSettingsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInboundMessagesNotificationSettings"></a>
# **getInboundMessagesNotificationSettings**
> GetInboundMessagesNotificationSettingsResponse getInboundMessagesNotificationSettings()

Get inbound messages notification settings

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.UserSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UserSettingsApi apiInstance = new UserSettingsApi();
try {
    GetInboundMessagesNotificationSettingsResponse result = apiInstance.getInboundMessagesNotificationSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserSettingsApi#getInboundMessagesNotificationSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetInboundMessagesNotificationSettingsResponse**](GetInboundMessagesNotificationSettingsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBalanceNotificationSettings"></a>
# **updateBalanceNotificationSettings**
> updateBalanceNotificationSettings(updateBalanceNotificationSettingsInputObject, xIgnoreNullValues)

Update balance notification settings

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.UserSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UserSettingsApi apiInstance = new UserSettingsApi();
UpdateBalanceNotificationSettingsInputObject updateBalanceNotificationSettingsInputObject = new UpdateBalanceNotificationSettingsInputObject(); // UpdateBalanceNotificationSettingsInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    apiInstance.updateBalanceNotificationSettings(updateBalanceNotificationSettingsInputObject, xIgnoreNullValues);
} catch (ApiException e) {
    System.err.println("Exception when calling UserSettingsApi#updateBalanceNotificationSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateBalanceNotificationSettingsInputObject** | [**UpdateBalanceNotificationSettingsInputObject**](UpdateBalanceNotificationSettingsInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateCallbackSettings"></a>
# **updateCallbackSettings**
> updateCallbackSettings(updateCallbackSettingsInputObject, xIgnoreNullValues)

Update callback URL settings

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.UserSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UserSettingsApi apiInstance = new UserSettingsApi();
UpdateCallbackSettingsInputObject updateCallbackSettingsInputObject = new UpdateCallbackSettingsInputObject(); // UpdateCallbackSettingsInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    apiInstance.updateCallbackSettings(updateCallbackSettingsInputObject, xIgnoreNullValues);
} catch (ApiException e) {
    System.err.println("Exception when calling UserSettingsApi#updateCallbackSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateCallbackSettingsInputObject** | [**UpdateCallbackSettingsInputObject**](UpdateCallbackSettingsInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateChatDesktopNotificationSettings"></a>
# **updateChatDesktopNotificationSettings**
> updateChatDesktopNotificationSettings(updateChatDesktopNotificationSettingsInputObject, xIgnoreNullValues)

Update chat desktop notification settings

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.UserSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UserSettingsApi apiInstance = new UserSettingsApi();
UpdateChatDesktopNotificationSettingsInputObject updateChatDesktopNotificationSettingsInputObject = new UpdateChatDesktopNotificationSettingsInputObject(); // UpdateChatDesktopNotificationSettingsInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    apiInstance.updateChatDesktopNotificationSettings(updateChatDesktopNotificationSettingsInputObject, xIgnoreNullValues);
} catch (ApiException e) {
    System.err.println("Exception when calling UserSettingsApi#updateChatDesktopNotificationSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateChatDesktopNotificationSettingsInputObject** | [**UpdateChatDesktopNotificationSettingsInputObject**](UpdateChatDesktopNotificationSettingsInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateInboundMessagesNotificationSettings"></a>
# **updateInboundMessagesNotificationSettings**
> updateInboundMessagesNotificationSettings(updateInboundMessagesNotificationSettingsInputObject, xIgnoreNullValues)

Update inbound messages notification settings

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.UserSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UserSettingsApi apiInstance = new UserSettingsApi();
UpdateInboundMessagesNotificationSettingsInputObject updateInboundMessagesNotificationSettingsInputObject = new UpdateInboundMessagesNotificationSettingsInputObject(); // UpdateInboundMessagesNotificationSettingsInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    apiInstance.updateInboundMessagesNotificationSettings(updateInboundMessagesNotificationSettingsInputObject, xIgnoreNullValues);
} catch (ApiException e) {
    System.err.println("Exception when calling UserSettingsApi#updateInboundMessagesNotificationSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateInboundMessagesNotificationSettingsInputObject** | [**UpdateInboundMessagesNotificationSettingsInputObject**](UpdateInboundMessagesNotificationSettingsInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

