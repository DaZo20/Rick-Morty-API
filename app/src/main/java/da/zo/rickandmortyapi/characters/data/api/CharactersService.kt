package da.zo.rickandmortyapi.characters.data.api

import da.zo.rickandmortyapi.characters.data.model.CharactersDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

//
// Created by DaZo20 on 10/01/2023.
//

interface CharactersService {
    @GET("character/")
    suspend fun getAllCharactersList(@Query("page") page: Int = 1): Response<CharactersDto?>

    @GET("character/{character_id}")
    suspend fun getSingleCharacter(@Query("character_id") id: Int = 1): Response<CharactersDto?>
}