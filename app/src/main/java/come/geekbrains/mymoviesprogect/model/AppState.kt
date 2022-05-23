package come.geekbrains.mymoviesprogect.model

sealed class AppState {
    data class Success(val weatherData: List<Movie>) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}