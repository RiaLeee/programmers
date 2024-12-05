def solution(myString, pat):
    count = 0
    start = 0

    # 문자열에서 `pat`을 찾기
    while start <= len(myString) - len(pat):
        # `myString`의 `start` 위치부터 `pat`을 찾음
        if myString[start:start + len(pat)] == pat:
            count += 1  # 찾았으면 카운트 증가
        start += 1  # 한 칸씩 이동 (겹치는 경우 처리)

    return count
