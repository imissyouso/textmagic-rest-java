# AuthenticationApi

All URIs are relative to *http://my.textmagic.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkPhoneVerificationCode**](AuthenticationApi.md#checkPhoneVerificationCode) | **PUT** /api/v2/user/phone/verification | Check user phone verification code
[**doAuth**](AuthenticationApi.md#doAuth) | **POST** /api/v2/auth | Authenticate user by given username and password.
[**sendEmailVerificationCode**](AuthenticationApi.md#sendEmailVerificationCode) | **GET** /api/v2/user/email/verification | Send user email verification
[**sendPhoneVerificationCode**](AuthenticationApi.md#sendPhoneVerificationCode) | **GET** /api/v2/user/phone/verification | Send user phone verification
[**updatePassword**](AuthenticationApi.md#updatePassword) | **PUT** /api/v2/user/password/change | Change user password.


<a name="checkPhoneVerificationCode"></a>
# **checkPhoneVerificationCode**
> checkPhoneVerificationCode(checkPhoneVerificationCodeInputObject, xIgnoreNullValues)

Check user phone verification code

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

AuthenticationApi apiInstance = new AuthenticationApi();
CheckPhoneVerificationCodeInputObject checkPhoneVerificationCodeInputObject = new CheckPhoneVerificationCodeInputObject(); // CheckPhoneVerificationCodeInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    apiInstance.checkPhoneVerificationCode(checkPhoneVerificationCodeInputObject, xIgnoreNullValues);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#checkPhoneVerificationCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkPhoneVerificationCodeInputObject** | [**CheckPhoneVerificationCodeInputObject**](CheckPhoneVerificationCodeInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="doAuth"></a>
# **doAuth**
> DoAuthResponse doAuth(doAuthInputObject, xIgnoreNullValues)

Authenticate user by given username and password.

Returning a username and token that you should pass to the all requests (in X-TM-Username and X-TM-Key, respectively)

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
DoAuthInputObject doAuthInputObject = new DoAuthInputObject(); // DoAuthInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    DoAuthResponse result = apiInstance.doAuth(doAuthInputObject, xIgnoreNullValues);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#doAuth");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doAuthInputObject** | [**DoAuthInputObject**](DoAuthInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

[**DoAuthResponse**](DoAuthResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendEmailVerificationCode"></a>
# **sendEmailVerificationCode**
> sendEmailVerificationCode()

Send user email verification

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

AuthenticationApi apiInstance = new AuthenticationApi();
try {
    apiInstance.sendEmailVerificationCode();
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#sendEmailVerificationCode");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendPhoneVerificationCode"></a>
# **sendPhoneVerificationCode**
> sendPhoneVerificationCode()

Send user phone verification

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

AuthenticationApi apiInstance = new AuthenticationApi();
try {
    apiInstance.sendPhoneVerificationCode();
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#sendPhoneVerificationCode");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePassword"></a>
# **updatePassword**
> updatePassword(updatePasswordInputObject, xIgnoreNullValues)

Change user password.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

AuthenticationApi apiInstance = new AuthenticationApi();
UpdatePasswordInputObject updatePasswordInputObject = new UpdatePasswordInputObject(); // UpdatePasswordInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    apiInstance.updatePassword(updatePasswordInputObject, xIgnoreNullValues);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#updatePassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updatePasswordInputObject** | [**UpdatePasswordInputObject**](UpdatePasswordInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

