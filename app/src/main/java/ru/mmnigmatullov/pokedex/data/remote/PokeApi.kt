package ru.mmnigmatullov.pokedex.data.remote

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import ru.mmnigmatullov.pokedex.data.remote.responses.Pokemon
import ru.mmnigmatullov.pokedex.data.remote.responses.PokemonList

interface PokeApi {

    @GET("pokemon")
    suspend fun getPokemonList(
        @Query("limit") limit: Int,
        @Query("offset") offset: Int
    ): PokemonList

    @GET("pokemon/{name}")
    suspend fun getPokemonInfo(
        @Path("name") name: String
    ): Pokemon
}