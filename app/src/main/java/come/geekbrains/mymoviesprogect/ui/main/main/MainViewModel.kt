package come.geekbrains.mymoviesprogect.ui.main.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import come.geekbrains.mymoviesprogect.model.AppState
import come.geekbrains.mymoviesprogect.model.repository.Repository

class MainViewModel(private val repository: Repository) : ViewModel() {
    private val localLiveData = MutableLiveData<AppState>()
    val liveData: LiveData<AppState> get() = localLiveData

    fun getMoviesFromLocalSourceWorld() = getDataFromLocalSource()

    private fun getDataFromLocalSource() {
        localLiveData.value = AppState.Loading
        Thread {
            Thread.sleep(1000)
            localLiveData.postValue(

                    AppState.Success(repository.getMoviesFromLocalStorageWorld())
            )
        }.start()
    }
}