# BillingApi

All URIs are relative to *http://my.textmagic.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInvoices**](BillingApi.md#getInvoices) | **GET** /api/v2/invoices | Return account invoices.
[**getSpendingStat**](BillingApi.md#getSpendingStat) | **GET** /api/v2/stats/spending | Return account spending statistics.


<a name="getInvoices"></a>
# **getInvoices**
> GetInvoicesResponse getInvoices(page, limit)

Return account invoices.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.BillingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

BillingApi apiInstance = new BillingApi();
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
try {
    GetInvoicesResponse result = apiInstance.getInvoices(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#getInvoices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]

### Return type

[**GetInvoicesResponse**](GetInvoicesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSpendingStat"></a>
# **getSpendingStat**
> GetSpendingStatResponse getSpendingStat(page, limit, start, end)

Return account spending statistics.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.BillingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

BillingApi apiInstance = new BillingApi();
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
Integer start = 56; // Integer | Optional. Start date in unix timestamp format. Default is 7 days ago
Integer end = 56; // Integer | Optional. End date in unix timestamp format. Default is now
try {
    GetSpendingStatResponse result = apiInstance.getSpendingStat(page, limit, start, end);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#getSpendingStat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]
 **start** | **Integer**| Optional. Start date in unix timestamp format. Default is 7 days ago | [optional]
 **end** | **Integer**| Optional. End date in unix timestamp format. Default is now | [optional]

### Return type

[**GetSpendingStatResponse**](GetSpendingStatResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

