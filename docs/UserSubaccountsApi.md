# UserSubaccountsApi

All URIs are relative to *http://my.textmagic.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**closeSubaccount**](UserSubaccountsApi.md#closeSubaccount) | **DELETE** /api/v2/subaccounts/{id} | Close subaccount.
[**getSubaccount**](UserSubaccountsApi.md#getSubaccount) | **GET** /api/v2/subaccounts/{id} | Get a single subaccount.
[**getSubaccounts**](UserSubaccountsApi.md#getSubaccounts) | **GET** /api/v2/subaccounts | Get all subaccounts of current user.
[**getSubaccountsWithTokens**](UserSubaccountsApi.md#getSubaccountsWithTokens) | **POST** /api/v2/subaccounts/tokens/list | Get all subaccounts with their REST API tokens associated with specified app name.
[**inviteSubaccount**](UserSubaccountsApi.md#inviteSubaccount) | **POST** /api/v2/subaccounts | Invite new subaccount.
[**requestNewSubaccountToken**](UserSubaccountsApi.md#requestNewSubaccountToken) | **POST** /api/v2/subaccounts/tokens | Request a new REST API token for subaccount.


<a name="closeSubaccount"></a>
# **closeSubaccount**
> closeSubaccount(id)

Close subaccount.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.UserSubaccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UserSubaccountsApi apiInstance = new UserSubaccountsApi();
Integer id = 1; // Integer | 
try {
    apiInstance.closeSubaccount(id);
} catch (ApiException e) {
    System.err.println("Exception when calling UserSubaccountsApi#closeSubaccount");
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

<a name="getSubaccount"></a>
# **getSubaccount**
> User getSubaccount(id)

Get a single subaccount.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.UserSubaccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UserSubaccountsApi apiInstance = new UserSubaccountsApi();
Integer id = 1; // Integer | 
try {
    User result = apiInstance.getSubaccount(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserSubaccountsApi#getSubaccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**User**](User.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSubaccounts"></a>
# **getSubaccounts**
> User getSubaccounts(page, limit)

Get all subaccounts of current user.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.UserSubaccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UserSubaccountsApi apiInstance = new UserSubaccountsApi();
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
try {
    User result = apiInstance.getSubaccounts(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserSubaccountsApi#getSubaccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]

### Return type

[**User**](User.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSubaccountsWithTokens"></a>
# **getSubaccountsWithTokens**
> GetSubaccountsWithTokensResponse getSubaccountsWithTokens(getSubaccountsWithTokensInputObject, page, limit, xIgnoreNullValues)

Get all subaccounts with their REST API tokens associated with specified app name.

When more than one token related to app name, last key will be returned.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.UserSubaccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UserSubaccountsApi apiInstance = new UserSubaccountsApi();
GetSubaccountsWithTokensInputObject getSubaccountsWithTokensInputObject = new GetSubaccountsWithTokensInputObject(); // GetSubaccountsWithTokensInputObject | 
BigDecimal page = new BigDecimal(); // BigDecimal | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    GetSubaccountsWithTokensResponse result = apiInstance.getSubaccountsWithTokens(getSubaccountsWithTokensInputObject, page, limit, xIgnoreNullValues);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserSubaccountsApi#getSubaccountsWithTokens");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getSubaccountsWithTokensInputObject** | [**GetSubaccountsWithTokensInputObject**](GetSubaccountsWithTokensInputObject.md)|  |
 **page** | **BigDecimal**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

[**GetSubaccountsWithTokensResponse**](GetSubaccountsWithTokensResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="inviteSubaccount"></a>
# **inviteSubaccount**
> inviteSubaccount(inviteSubaccountInputObject, xIgnoreNullValues)

Invite new subaccount.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.UserSubaccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UserSubaccountsApi apiInstance = new UserSubaccountsApi();
InviteSubaccountInputObject inviteSubaccountInputObject = new InviteSubaccountInputObject(); // InviteSubaccountInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    apiInstance.inviteSubaccount(inviteSubaccountInputObject, xIgnoreNullValues);
} catch (ApiException e) {
    System.err.println("Exception when calling UserSubaccountsApi#inviteSubaccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inviteSubaccountInputObject** | [**InviteSubaccountInputObject**](InviteSubaccountInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="requestNewSubaccountToken"></a>
# **requestNewSubaccountToken**
> User requestNewSubaccountToken(requestNewSubaccountTokenInputObject, xIgnoreNullValues)

Request a new REST API token for subaccount.

Returning user object, key and app name.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.UserSubaccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UserSubaccountsApi apiInstance = new UserSubaccountsApi();
RequestNewSubaccountTokenInputObject requestNewSubaccountTokenInputObject = new RequestNewSubaccountTokenInputObject(); // RequestNewSubaccountTokenInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    User result = apiInstance.requestNewSubaccountToken(requestNewSubaccountTokenInputObject, xIgnoreNullValues);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserSubaccountsApi#requestNewSubaccountToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestNewSubaccountTokenInputObject** | [**RequestNewSubaccountTokenInputObject**](RequestNewSubaccountTokenInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

[**User**](User.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

