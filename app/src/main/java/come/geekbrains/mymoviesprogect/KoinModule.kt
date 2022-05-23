package come.geekbrains.mymoviesprogect

import come.geekbrains.mymoviesprogect.model.repository.Repository
import come.geekbrains.mymoviesprogect.model.repository.RepositoryImpl
import come.geekbrains.mymoviesprogect.ui.main.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single<Repository> { RepositoryImpl() }

    viewModel { MainViewModel(get()) }
}