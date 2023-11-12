package com.salgam.upbit.api

import com.salgam.upbit.dto.response.AccountResponseDto
import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.HttpEntity
import org.springframework.http.HttpMethod
import org.springframework.http.ResponseEntity
import org.springframework.util.LinkedMultiValueMap
import org.springframework.web.client.RestTemplate

class UpbitApi {

    private val restTemplate = RestTemplate()

    private val UPBIT_DOMAIN = "http://api.upbit.com"
    private val ACCOUNT_ENDPONINT = "/v1/accounts"

    fun getAccounts(bearerToken: String) :ResponseEntity<List<AccountResponseDto>> {

        val request = HttpEntity(null, LinkedMultiValueMap<String, String>().apply {
            add("Authorization", bearerToken) })
        return restTemplate.exchange(UPBIT_DOMAIN + ACCOUNT_ENDPONINT, HttpMethod.GET, request,
            object: ParameterizedTypeReference<List<AccountResponseDto>>(){})

    }

}