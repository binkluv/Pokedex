package ru.mmnigmatullov.pokedex.repository

import dagger.hilt.android.scopes.ActivityScoped
import ru.mmnigmatullov.pokedex.data.remote.PokeApi
import ru.mmnigmatullov.pokedex.data.remote.responses.Pokemon
import ru.mmnigmatullov.pokedex.data.remote.responses.PokemonList
import ru.mmnigmatullov.pokedex.util.Resource
import javax.inject.Inject

@ActivityScoped
class PokemonRepository @Inject constructor(
  private val api: PokeApi
) {
    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList> {
        val response = try {
            api.getPokemonList(limit, offset)
        } catch(e: Exception) {
            return Resource.Error("Произошла неизвестная ошибка.")
        }
        return Resource.Success(response)
    }
    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        val response = try {
            api.getPokemonInfo(pokemonName)
        } catch(e: Exception) {
            return Resource.Error("Произошла неизвестная ошибка.")
        }
        return Resource.Success(response)
    }
}