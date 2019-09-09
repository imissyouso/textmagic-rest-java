# ContactNotesApi

All URIs are relative to *http://my.textmagic.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createContactNote**](ContactNotesApi.md#createContactNote) | **POST** /api/v2/contacts/{id}/notes | Create a new contact note.
[**deleteContactNote**](ContactNotesApi.md#deleteContactNote) | **DELETE** /api/v2/notes/{id} | Delete a single contact note.
[**deleteContactNotesBulk**](ContactNotesApi.md#deleteContactNotesBulk) | **POST** /api/v2/contacts/{id}/notes/delete | Delete contact note by given ID(s) or delete all contact notes.
[**getContactNote**](ContactNotesApi.md#getContactNote) | **GET** /api/v2/notes/{id} | Get a single contact note.
[**getContactNotes**](ContactNotesApi.md#getContactNotes) | **GET** /api/v2/contacts/{id}/notes | Fetch notes assigned to the given contact.
[**updateContactNote**](ContactNotesApi.md#updateContactNote) | **PUT** /api/v2/notes/{id} | Update existing contact note.


<a name="createContactNote"></a>
# **createContactNote**
> ResourceLinkResponse createContactNote(createContactNoteInputObject, id, xIgnoreNullValues)

Create a new contact note.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactNotesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactNotesApi apiInstance = new ContactNotesApi();
CreateContactNoteInputObject createContactNoteInputObject = new CreateContactNoteInputObject(); // CreateContactNoteInputObject | 
Integer id = 56; // Integer | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    ResourceLinkResponse result = apiInstance.createContactNote(createContactNoteInputObject, id, xIgnoreNullValues);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactNotesApi#createContactNote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createContactNoteInputObject** | [**CreateContactNoteInputObject**](CreateContactNoteInputObject.md)|  |
 **id** | **Integer**|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteContactNote"></a>
# **deleteContactNote**
> deleteContactNote(id)

Delete a single contact note.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactNotesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactNotesApi apiInstance = new ContactNotesApi();
Integer id = 1; // Integer | 
try {
    apiInstance.deleteContactNote(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactNotesApi#deleteContactNote");
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

<a name="deleteContactNotesBulk"></a>
# **deleteContactNotesBulk**
> deleteContactNotesBulk(id, deleteContactNotesBulkInputObject, xIgnoreNullValues)

Delete contact note by given ID(s) or delete all contact notes.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactNotesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactNotesApi apiInstance = new ContactNotesApi();
Integer id = 1; // Integer | 
DeleteContactNotesBulkInputObject deleteContactNotesBulkInputObject = new DeleteContactNotesBulkInputObject(); // DeleteContactNotesBulkInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    apiInstance.deleteContactNotesBulk(id, deleteContactNotesBulkInputObject, xIgnoreNullValues);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactNotesApi#deleteContactNotesBulk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **deleteContactNotesBulkInputObject** | [**DeleteContactNotesBulkInputObject**](DeleteContactNotesBulkInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getContactNote"></a>
# **getContactNote**
> ContactNote getContactNote(id)

Get a single contact note.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactNotesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactNotesApi apiInstance = new ContactNotesApi();
Integer id = 56; // Integer | 
try {
    ContactNote result = apiInstance.getContactNote(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactNotesApi#getContactNote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**ContactNote**](ContactNote.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContactNotes"></a>
# **getContactNotes**
> GetContactNotesResponse getContactNotes(id, page, limit)

Fetch notes assigned to the given contact.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactNotesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactNotesApi apiInstance = new ContactNotesApi();
Integer id = 1; // Integer | 
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
try {
    GetContactNotesResponse result = apiInstance.getContactNotes(id, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactNotesApi#getContactNotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]

### Return type

[**GetContactNotesResponse**](GetContactNotesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateContactNote"></a>
# **updateContactNote**
> ResourceLinkResponse updateContactNote(updateContactNoteInputObject, id, xIgnoreNullValues)

Update existing contact note.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactNotesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactNotesApi apiInstance = new ContactNotesApi();
UpdateContactNoteInputObject updateContactNoteInputObject = new UpdateContactNoteInputObject(); // UpdateContactNoteInputObject | 
Integer id = 1; // Integer | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    ResourceLinkResponse result = apiInstance.updateContactNote(updateContactNoteInputObject, id, xIgnoreNullValues);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactNotesApi#updateContactNote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateContactNoteInputObject** | [**UpdateContactNoteInputObject**](UpdateContactNoteInputObject.md)|  |
 **id** | **Integer**|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

