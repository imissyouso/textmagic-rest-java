# UserApi

All URIs are relative to *http://my.textmagic.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAvatar**](UserApi.md#deleteAvatar) | **DELETE** /api/v2/user/avatar | Delete an avatar for the current user.\\
[**getCurrentUser**](UserApi.md#getCurrentUser) | **GET** /api/v2/user | Get current user info.
[**getDisallowedRules**](UserApi.md#getDisallowedRules) | **GET** /api/v2/user/disallowed-rules | Get an array of all rules that are disallowed to the current account.
[**updateCurrentUser**](UserApi.md#updateCurrentUser) | **PUT** /api/v2/user | Update current user info.
[**uploadAvatar**](UserApi.md#uploadAvatar) | **POST** /api/v2/user/avatar | Add an avatar for the current user.


<a name="deleteAvatar"></a>
# **deleteAvatar**
> deleteAvatar()

Delete an avatar for the current user.\\

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UserApi apiInstance = new UserApi();
try {
    apiInstance.deleteAvatar();
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteAvatar");
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
 - **Accept**: Not defined

<a name="getCurrentUser"></a>
# **getCurrentUser**
> User getCurrentUser()

Get current user info.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UserApi apiInstance = new UserApi();
try {
    User result = apiInstance.getCurrentUser();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getCurrentUser");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDisallowedRules"></a>
# **getDisallowedRules**
> List&lt;String&gt; getDisallowedRules()

Get an array of all rules that are disallowed to the current account.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UserApi apiInstance = new UserApi();
try {
    List<String> result = apiInstance.getDisallowedRules();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getDisallowedRules");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCurrentUser"></a>
# **updateCurrentUser**
> UpdateCurrentUserResponse updateCurrentUser(updateCurrentUserInputObject, xIgnoreNullValues)

Update current user info.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UserApi apiInstance = new UserApi();
UpdateCurrentUserInputObject updateCurrentUserInputObject = new UpdateCurrentUserInputObject(); // UpdateCurrentUserInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    UpdateCurrentUserResponse result = apiInstance.updateCurrentUser(updateCurrentUserInputObject, xIgnoreNullValues);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#updateCurrentUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateCurrentUserInputObject** | [**UpdateCurrentUserInputObject**](UpdateCurrentUserInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

[**UpdateCurrentUserResponse**](UpdateCurrentUserResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadAvatar"></a>
# **uploadAvatar**
> uploadAvatar(image)

Add an avatar for the current user.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UserApi apiInstance = new UserApi();
File image = new File("/path/to/file.txt"); // File | User avatar. Should be PNG or JPG file not more than 10 MB
try {
    apiInstance.uploadAvatar(image);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#uploadAvatar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **File**| User avatar. Should be PNG or JPG file not more than 10 MB |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

