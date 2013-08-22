class DateService {

	static transactional = 'mongo'

    long currentTime() {
        return System.currentTimeMillis()
    }
}
