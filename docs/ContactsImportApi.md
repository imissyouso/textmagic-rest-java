# ContactsImportApi

All URIs are relative to *http://my.textmagic.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getContactImportSessionProgress**](ContactsImportApi.md#getContactImportSessionProgress) | **GET** /api/v2/contacts/import/progress/{id} | Get contact import session progress.


<a name="getContactImportSessionProgress"></a>
# **getContactImportSessionProgress**
> GetContactImportSessionProgressResponse getContactImportSessionProgress(id)

Get contact import session progress.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactsImportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactsImportApi apiInstance = new ContactsImportApi();
Integer id = 56; // Integer | 
try {
    GetContactImportSessionProgressResponse result = apiInstance.getContactImportSessionProgress(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsImportApi#getContactImportSessionProgress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**GetContactImportSessionProgressResponse**](GetContactImportSessionProgressResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

