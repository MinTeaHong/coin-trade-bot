package com.salgam.upbit.utils

import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import java.util.UUID

class Util {
    companion object {
        fun getBearerAuthenticationToken(accessKey: String, secretKey: String): String {
            return "Bearer" + JWT.create()
                .withClaim("access_key", accessKey)
                .withClaim("nonce", UUID.randomUUID().toString())
                .sign(Algorithm.HMAC256(secretKey))

        }

    }
}