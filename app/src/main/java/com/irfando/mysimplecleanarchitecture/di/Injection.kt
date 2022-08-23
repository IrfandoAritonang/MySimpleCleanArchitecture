package com.irfando.mysimplecleanarchitecture.di

import com.irfando.mysimplecleanarchitecture.data.IMessageDataSource
import com.irfando.mysimplecleanarchitecture.data.MessageDataSource
import com.irfando.mysimplecleanarchitecture.data.MessageRepository
import com.irfando.mysimplecleanarchitecture.domain.IMessageRepository
import com.irfando.mysimplecleanarchitecture.domain.MessageInteractor
import com.irfando.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}