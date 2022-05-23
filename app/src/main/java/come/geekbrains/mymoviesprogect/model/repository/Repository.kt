package come.geekbrains.mymoviesprogect.model.repository

import come.geekbrains.mymoviesprogect.model.Movie

interface Repository {

    fun getMoviesFromServer(): Movie
    fun getMoviesFromLocalStorageWorld(): List<Movie>
}