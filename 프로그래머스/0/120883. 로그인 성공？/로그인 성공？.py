def solution(id_pw, db):
    
    for db_id, db_pw in db:
        if db_id == id_pw[0] and db_pw == id_pw[1]:
            return "login"
        elif db_id == id_pw[0] and db_pw != id_pw[1]:
            return "wrong pw"
    return "fail"
    