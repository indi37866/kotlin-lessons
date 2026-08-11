package revision

data class UserProfile(val name: String, val balance: Double) {
    companion object {
        const val DEFAULT_CURRENCY = "$"
    }
}