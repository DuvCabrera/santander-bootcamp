package com.duv.tdd

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(RobolectricTestRunner::class)
class ContactHelperTest {
    private val context = ApplicationProvider.getApplicationContext<Context>()
    private val sharedPreferences =
        context.getSharedPreferences("com.duv.tdd.PREFERENCES", Context.MODE_PRIVATE)
    private val contactHelper = ContactHelper(sharedPreferences)

    @Test
    fun `Quando chamar o metodo getListContacts() com 2 contatos, deve retornar uma lista de 2 contatos`() {
        // Prerare - cria os dados fake
        mockListDoisContatos()

        // Valida
        val list =  contactHelper.getListContatics()
        assertEquals(2, list.size)
    }

    @Test
    fun `Quando chamar o metodo getListContacts() sem contatos, deve retornar uma lista vazia`(){
        //Prepara
        mockListaContatosVazia()

        //Valida
        val list = contactHelper.getListContatics()
        assertEquals(0, list.size)
    }

    private fun mockListDoisContatos() {
        contactHelper.setListContacts(
            arrayListOf(
                Contact(
                    "Igor Ferrani",
                    "(00) 0000-0000",
                    "img.jpg"
                ),
                Contact(
                    "Jose Alves",
                    "(99) 9999-9999",
                    "img.jpg"
                )
            )
        )
    }

    private fun mockListaContatosVazia(){
        contactHelper.setListContacts(arrayListOf())
    }
}