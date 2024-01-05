SELECT * FROM leetcode.invalidtweets;
INSERT INTO invalidtweets(tweetid,content) VALUES (1,'Vote for Biden');
INSERT INTO invalidtweets(tweetid,content) VALUES (2,'Let us make America great again!');
select tweetid from invalidtweets where length(content)>15;