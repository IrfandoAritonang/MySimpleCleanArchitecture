package com.irfando.mysimplecleanarchitecture.data

import com.irfando.mysimplecleanarchitecture.domain.MessageEntity


interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}