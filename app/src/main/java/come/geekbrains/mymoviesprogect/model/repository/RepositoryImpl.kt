package come.geekbrains.mymoviesprogect.model.repository

import come.geekbrains.mymoviesprogect.model.Movie
import come.geekbrains.mymoviesprogect.model.getWorldMovies

class RepositoryImpl: Repository {
    override fun getMoviesFromServer(): Movie = Movie()

    override fun getMoviesFromLocalStorageWorld(): List<Movie> {
        return getWorldMovies()
    }
}