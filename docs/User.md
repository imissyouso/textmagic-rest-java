
# User

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | User ID. | 
**displayTimeFormat** | **String** | Format for representation of time |  [optional]
**username** | **String** | Username. | 
**firstName** | **String** | Account first name. | 
**lastName** | **String** | Account last name. | 
**email** | **String** | User email address. | 
**status** | [**StatusEnum**](#StatusEnum) | Current account status: * **A** for Active * **T** for Trial.  | 
**balance** | [**BigDecimal**](BigDecimal.md) | Account balance (in account currency). | 
**phone** | **String** |  | 
**company** | **String** | Account company name. | 
**currency** | [**Currency**](Currency.md) |  | 
**country** | [**Country**](Country.md) |  | 
**timezone** | [**Timezone**](Timezone.md) |  | 
**subaccountType** | [**SubaccountTypeEnum**](#SubaccountTypeEnum) | Type of account: * **P** for Parent User * **A** for Administrator Sub-Account * **U** for Regular User  | 
**emailAccepted** | **Boolean** |  | 
**phoneAccepted** | **Boolean** |  | 
**avatar** | [**UserImage**](UserImage.md) |  | 


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
A | &quot;A&quot;
T | &quot;T&quot;


<a name="SubaccountTypeEnum"></a>
## Enum: SubaccountTypeEnum
Name | Value
---- | -----
P | &quot;P&quot;
A | &quot;A&quot;
U | &quot;U&quot;



