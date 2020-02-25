package com.urbanclap.loki.utils
/*

import android.support.constraint.Placeholder
import android.text.TextUtils
import com.urbanclap.provider.urbanclap_android_provider.ResourceProvider
import launch.GetAppConfig

*/
/**
 * Created by aadishgoel on 26/11/19.
 *//*


class NameParser {
    companion object {

        @JvmField
        val defaultCompanyName = "UC"

        @JvmField
        val defaultPlaceHolder = "{{company_name}}"

        @JvmStatic
        @JvmOverloads
        fun getParsedString(data: String, placeholder: String = defaultPlaceHolder, companyName:
        String = GetAppConfig.fetcher().synchronizedFetch()?.companyName
                ?: ""): String {
            if (!TextUtils.isEmpty(companyName)) {
                return data.replace(placeholder, companyName, true)
            }
            return data.replace(placeholder, defaultCompanyName, true)
        }

        @JvmStatic
        @JvmOverloads
        fun getParsedStringFromRes(data: Int, placeholder: String = defaultPlaceHolder): String {
            return getParsedString(ResourceProvider.getString(data), placeholder)
        }

        @JvmStatic
        fun getCompanyName(): String = GetAppConfig.fetcher().synchronizedFetch()?.companyName ?: defaultCompanyName

    }
}*/
