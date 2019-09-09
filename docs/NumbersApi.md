# NumbersApi

All URIs are relative to *http://my.textmagic.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**buyDedicatedNumber**](NumbersApi.md#buyDedicatedNumber) | **POST** /api/v2/numbers | Buy a dedicated number and assign it to the specified account.
[**deleteDedicatedNumber**](NumbersApi.md#deleteDedicatedNumber) | **DELETE** /api/v2/numbers/{id} | Cancel dedicated number subscription.
[**deleteSenderId**](NumbersApi.md#deleteSenderId) | **DELETE** /api/v2/senderids/{id} | Delete a Sender ID.
[**getAvailableDedicatedNumbers**](NumbersApi.md#getAvailableDedicatedNumbers) | **GET** /api/v2/numbers/available | Find available dedicated numbers to buy.
[**getDedicatedNumber**](NumbersApi.md#getDedicatedNumber) | **GET** /api/v2/numbers/{id} | Get a single dedicated number.
[**getSenderId**](NumbersApi.md#getSenderId) | **GET** /api/v2/senderids/{id} | Get a single Sender ID.
[**getSenderIds**](NumbersApi.md#getSenderIds) | **GET** /api/v2/senderids | Get all sender IDs of current user.
[**getSenderSettings**](NumbersApi.md#getSenderSettings) | **GET** /api/v2/sender/settings | Get current user sender settings.
[**getUserDedicatedNumbers**](NumbersApi.md#getUserDedicatedNumbers) | **GET** /api/v2/numbers | Get user&#39;s dedicated numbers.
[**requestSenderId**](NumbersApi.md#requestSenderId) | **POST** /api/v2/senderids | Request for a new Sender ID.
[**updateSenderSetting**](NumbersApi.md#updateSenderSetting) | **PUT** /api/v2/sender/settings | Change sender settings for specified country.


<a name="buyDedicatedNumber"></a>
# **buyDedicatedNumber**
> buyDedicatedNumber(buyDedicatedNumberInputObject, xIgnoreNullValues)

Buy a dedicated number and assign it to the specified account.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.NumbersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

NumbersApi apiInstance = new NumbersApi();
BuyDedicatedNumberInputObject buyDedicatedNumberInputObject = new BuyDedicatedNumberInputObject(); // BuyDedicatedNumberInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    apiInstance.buyDedicatedNumber(buyDedicatedNumberInputObject, xIgnoreNullValues);
} catch (ApiException e) {
    System.err.println("Exception when calling NumbersApi#buyDedicatedNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyDedicatedNumberInputObject** | [**BuyDedicatedNumberInputObject**](BuyDedicatedNumberInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDedicatedNumber"></a>
# **deleteDedicatedNumber**
> deleteDedicatedNumber(id)

Cancel dedicated number subscription.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.NumbersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

NumbersApi apiInstance = new NumbersApi();
Integer id = 1; // Integer | 
try {
    apiInstance.deleteDedicatedNumber(id);
} catch (ApiException e) {
    System.err.println("Exception when calling NumbersApi#deleteDedicatedNumber");
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

<a name="deleteSenderId"></a>
# **deleteSenderId**
> deleteSenderId(id)

Delete a Sender ID.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.NumbersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

NumbersApi apiInstance = new NumbersApi();
Integer id = 1; // Integer | 
try {
    apiInstance.deleteSenderId(id);
} catch (ApiException e) {
    System.err.println("Exception when calling NumbersApi#deleteSenderId");
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

<a name="getAvailableDedicatedNumbers"></a>
# **getAvailableDedicatedNumbers**
> GetAvailableDedicatedNumbersResponse getAvailableDedicatedNumbers(country, prefix, tollfree)

Find available dedicated numbers to buy.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.NumbersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

NumbersApi apiInstance = new NumbersApi();
String country = "\"GB\""; // String | Dedicated number country. Two letters in upper case
Integer prefix = 1; // Integer | Desired number prefix. Should include country code (i.e. 447 for GB). In case provide tollfree = 1 parameter and there are available tollfree numbers, this parameter will be ignore.
Integer tollfree = 0; // Integer | Should we show only tollfree numbers (tollfree available only for US). Default is false.
try {
    GetAvailableDedicatedNumbersResponse result = apiInstance.getAvailableDedicatedNumbers(country, prefix, tollfree);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumbersApi#getAvailableDedicatedNumbers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **String**| Dedicated number country. Two letters in upper case |
 **prefix** | **Integer**| Desired number prefix. Should include country code (i.e. 447 for GB). In case provide tollfree &#x3D; 1 parameter and there are available tollfree numbers, this parameter will be ignore. | [optional] [default to 1]
 **tollfree** | **Integer**| Should we show only tollfree numbers (tollfree available only for US). Default is false. | [optional] [default to 0]

### Return type

[**GetAvailableDedicatedNumbersResponse**](GetAvailableDedicatedNumbersResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDedicatedNumber"></a>
# **getDedicatedNumber**
> UsersInbound getDedicatedNumber(id)

Get a single dedicated number.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.NumbersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

NumbersApi apiInstance = new NumbersApi();
Integer id = 1; // Integer | 
try {
    UsersInbound result = apiInstance.getDedicatedNumber(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumbersApi#getDedicatedNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**UsersInbound**](UsersInbound.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSenderId"></a>
# **getSenderId**
> SenderId getSenderId(id)

Get a single Sender ID.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.NumbersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

NumbersApi apiInstance = new NumbersApi();
Integer id = 1; // Integer | 
try {
    SenderId result = apiInstance.getSenderId(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumbersApi#getSenderId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**SenderId**](SenderId.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSenderIds"></a>
# **getSenderIds**
> GetSenderIdsResponse getSenderIds(page, limit)

Get all sender IDs of current user.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.NumbersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

NumbersApi apiInstance = new NumbersApi();
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
try {
    GetSenderIdsResponse result = apiInstance.getSenderIds(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumbersApi#getSenderIds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]

### Return type

[**GetSenderIdsResponse**](GetSenderIdsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSenderSettings"></a>
# **getSenderSettings**
> GetSenderSettingsResponse getSenderSettings(country)

Get current user sender settings.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.NumbersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

NumbersApi apiInstance = new NumbersApi();
String country = "country_example"; // String | Return sender settings enabled for sending to specified country. Two upper case characters
try {
    GetSenderSettingsResponse result = apiInstance.getSenderSettings(country);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumbersApi#getSenderSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **String**| Return sender settings enabled for sending to specified country. Two upper case characters | [optional]

### Return type

[**GetSenderSettingsResponse**](GetSenderSettingsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserDedicatedNumbers"></a>
# **getUserDedicatedNumbers**
> GetUserDedicatedNumbersResponse getUserDedicatedNumbers(page, limit, surveyId)

Get user&#39;s dedicated numbers.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.NumbersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

NumbersApi apiInstance = new NumbersApi();
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
Integer surveyId = 56; // Integer | Fetch only that numbers which are ready for the survey
try {
    GetUserDedicatedNumbersResponse result = apiInstance.getUserDedicatedNumbers(page, limit, surveyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumbersApi#getUserDedicatedNumbers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]
 **surveyId** | **Integer**| Fetch only that numbers which are ready for the survey | [optional]

### Return type

[**GetUserDedicatedNumbersResponse**](GetUserDedicatedNumbersResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="requestSenderId"></a>
# **requestSenderId**
> ResourceLinkResponse requestSenderId(requestSenderIdInputObject, xIgnoreNullValues)

Request for a new Sender ID.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.NumbersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

NumbersApi apiInstance = new NumbersApi();
RequestSenderIdInputObject requestSenderIdInputObject = new RequestSenderIdInputObject(); // RequestSenderIdInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    ResourceLinkResponse result = apiInstance.requestSenderId(requestSenderIdInputObject, xIgnoreNullValues);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumbersApi#requestSenderId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestSenderIdInputObject** | [**RequestSenderIdInputObject**](RequestSenderIdInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSenderSetting"></a>
# **updateSenderSetting**
> updateSenderSetting(updateSenderSettingInputObject, xIgnoreNullValues)

Change sender settings for specified country.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.NumbersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

NumbersApi apiInstance = new NumbersApi();
UpdateSenderSettingInputObject updateSenderSettingInputObject = new UpdateSenderSettingInputObject(); // UpdateSenderSettingInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    apiInstance.updateSenderSetting(updateSenderSettingInputObject, xIgnoreNullValues);
} catch (ApiException e) {
    System.err.println("Exception when calling NumbersApi#updateSenderSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateSenderSettingInputObject** | [**UpdateSenderSettingInputObject**](UpdateSenderSettingInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

