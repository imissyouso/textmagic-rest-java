# StatisticApi

All URIs are relative to *http://my.textmagic.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMessagingCounters**](StatisticApi.md#getMessagingCounters) | **GET** /api/v2/stats/messaging/data | Return counters for messaging data views.
[**getMessagingStat**](StatisticApi.md#getMessagingStat) | **GET** /api/v2/stats/messaging | Return messaging statistics.


<a name="getMessagingCounters"></a>
# **getMessagingCounters**
> GetMessagingCountersResponse getMessagingCounters()

Return counters for messaging data views.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.StatisticApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

StatisticApi apiInstance = new StatisticApi();
try {
    GetMessagingCountersResponse result = apiInstance.getMessagingCounters();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatisticApi#getMessagingCounters");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetMessagingCountersResponse**](GetMessagingCountersResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMessagingStat"></a>
# **getMessagingStat**
> GetMessagingStatResponse getMessagingStat(by, start, end)

Return messaging statistics.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.StatisticApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

StatisticApi apiInstance = new StatisticApi();
String by = "off"; // String | Group results by specified period: off, day, month or year. Default is off
Integer start = 56; // Integer | Start date in unix timestamp format. Default is 7 days ago
String end = "end_example"; // String | End date in unix timestamp format. Default is now
try {
    GetMessagingStatResponse result = apiInstance.getMessagingStat(by, start, end);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatisticApi#getMessagingStat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **by** | **String**| Group results by specified period: off, day, month or year. Default is off | [optional] [default to off] [enum: off, day, month, year]
 **start** | **Integer**| Start date in unix timestamp format. Default is 7 days ago | [optional]
 **end** | **String**| End date in unix timestamp format. Default is now | [optional]

### Return type

[**GetMessagingStatResponse**](GetMessagingStatResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

