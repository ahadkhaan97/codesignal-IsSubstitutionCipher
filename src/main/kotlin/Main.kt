fun main() {
    print(solution("aaxyaa", "aazzaa"))
}

fun solution(string1: String, string2: String): Boolean {

    if (string1.length != string2.length)
        return false

    val map1 = HashMap<Char, Char>()
    val map2 = HashMap<Char, Char>()


    for (i in string1.indices) {
        if (map1.containsKey(string1[i]) && map1[string1[i]] != string2[i])
            return false
        map1[string1[i]] = string2[i]
    }

    for (i in string2.indices) {
        if (map2.containsKey(string2[i]) && map2[string2[i]] != string1[i])
            return false
        map2[string2[i]] = string1[i]
    }

    return true
}
