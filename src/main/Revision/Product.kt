package revision

sealed class NetworkResult {
    data class Success(val code: Int, val data: String): NetworkResult()
    data class Error(val message: String): NetworkResult()
    data object Loading: NetworkResult()
}
