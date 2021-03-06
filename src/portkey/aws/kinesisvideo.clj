(ns portkey.aws.kinesisvideo (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "kinesisvideo", :region "ap-northeast-1"},
    :ssl-common-name "kinesisvideo.ap-northeast-1.amazonaws.com",
    :endpoint "https://kinesisvideo.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "kinesisvideo", :region "eu-west-1"},
    :ssl-common-name "kinesisvideo.eu-west-1.amazonaws.com",
    :endpoint "https://kinesisvideo.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "kinesisvideo", :region "eu-central-1"},
    :ssl-common-name "kinesisvideo.eu-central-1.amazonaws.com",
    :endpoint "https://kinesisvideo.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "kinesisvideo", :region "us-west-2"},
    :ssl-common-name "kinesisvideo.us-west-2.amazonaws.com",
    :endpoint "https://kinesisvideo.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "kinesisvideo", :region "us-east-1"},
    :ssl-common-name "kinesisvideo.us-east-1.amazonaws.com",
    :endpoint "https://kinesisvideo.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.tags-per-resource-exceeded-limit-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/tags-per-resource-exceeded-limit-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.tags-per-resource-exceeded-limit-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/stream-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 256)) (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.untag-stream-input/streamarn (clojure.spec.alpha/and :portkey.aws.kinesisvideo/resourcearn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/untag-stream-input (portkey.aws/json-keys :req-un [:portkey.aws.kinesisvideo/TagKeyList] :opt-un [:portkey.aws.kinesisvideo.untag-stream-input/StreamARN :portkey.aws.kinesisvideo/StreamName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.stream-info/creation-time (clojure.spec.alpha/and :portkey.aws.kinesisvideo/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.stream-info/streamarn (clojure.spec.alpha/and :portkey.aws.kinesisvideo/resourcearn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/stream-info (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo/StreamName :portkey.aws.kinesisvideo/MediaType :portkey.aws.kinesisvideo/DataRetentionInHours :portkey.aws.kinesisvideo/Status :portkey.aws.kinesisvideo/KmsKeyId :portkey.aws.kinesisvideo.stream-info/CreationTime :portkey.aws.kinesisvideo/DeviceName :portkey.aws.kinesisvideo.stream-info/StreamARN :portkey.aws.kinesisvideo/Version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.version-mismatch-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/version-mismatch-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.version-mismatch-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/media-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 128)) (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"[\w\-\.\+]+/[\w\-\.\+]+" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/data-retention-in-hours (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16202__16203__auto__] (clojure.core/<= 0 p1__16202__16203__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/update-data-retention-operation (clojure.spec.alpha/conformer (clojure.core/let [m__16140__auto__ {"INCREASE_DATA_RETENTION" "INCREASE_DATA_RETENTION", :increase-data-retention "INCREASE_DATA_RETENTION", "DECREASE_DATA_RETENTION" "DECREASE_DATA_RETENTION", :decrease-data-retention "DECREASE_DATA_RETENTION"}] (clojure.core/fn [s__16141__auto__] (m__16140__auto__ s__16141__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.tag-stream-input/streamarn (clojure.spec.alpha/and :portkey.aws.kinesisvideo/resourcearn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.tag-stream-input/tags (clojure.spec.alpha/and :portkey.aws.kinesisvideo/resource-tags))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/tag-stream-input (portkey.aws/json-keys :req-un [:portkey.aws.kinesisvideo.tag-stream-input/Tags] :opt-un [:portkey.aws.kinesisvideo.tag-stream-input/StreamARN :portkey.aws.kinesisvideo/StreamName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.list-tags-for-stream-output/tags (clojure.spec.alpha/and :portkey.aws.kinesisvideo/resource-tags))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/list-tags-for-stream-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo/NextToken :portkey.aws.kinesisvideo.list-tags-for-stream-output/Tags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.update-data-retention-input/streamarn (clojure.spec.alpha/and :portkey.aws.kinesisvideo/resourcearn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.update-data-retention-input/current-version (clojure.spec.alpha/and :portkey.aws.kinesisvideo/version))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.update-data-retention-input/operation (clojure.spec.alpha/and :portkey.aws.kinesisvideo/update-data-retention-operation))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/update-data-retention-input (portkey.aws/json-keys :req-un [:portkey.aws.kinesisvideo.update-data-retention-input/CurrentVersion :portkey.aws.kinesisvideo.update-data-retention-input/Operation :portkey.aws.kinesisvideo/DataRetentionChangeInHours] :opt-un [:portkey.aws.kinesisvideo/StreamName :portkey.aws.kinesisvideo.update-data-retention-input/StreamARN] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/resource-tags (clojure.spec.alpha/map-of :portkey.aws.kinesisvideo/tag-key :portkey.aws.kinesisvideo/tag-value))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.resource-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/resource-in-use-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.resource-in-use-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/describe-stream-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo/StreamInfo] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/stream-info-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.kinesisvideo/stream-info) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/comparison-operator (clojure.spec.alpha/conformer (clojure.core/let [m__16140__auto__ {"BEGINS_WITH" "BEGINS_WITH", :begins-with "BEGINS_WITH"}] (clojure.core/fn [s__16141__auto__] (m__16140__auto__ s__16141__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.not-authorized-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/not-authorized-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.not-authorized-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/apiname (clojure.spec.alpha/conformer (clojure.core/let [m__16140__auto__ {"PUT_MEDIA" "PUT_MEDIA", :put-media "PUT_MEDIA", "GET_MEDIA" "GET_MEDIA", :get-media "GET_MEDIA", "LIST_FRAGMENTS" "LIST_FRAGMENTS", :list-fragments "LIST_FRAGMENTS", "GET_MEDIA_FOR_FRAGMENT_LIST" "GET_MEDIA_FOR_FRAGMENT_LIST", :get-media-for-fragment-list "GET_MEDIA_FOR_FRAGMENT_LIST"}] (clojure.core/fn [s__16141__auto__] (m__16140__auto__ s__16141__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/status (clojure.spec.alpha/conformer (clojure.core/let [m__16140__auto__ {"CREATING" "CREATING", :creating "CREATING", "ACTIVE" "ACTIVE", :active "ACTIVE", "UPDATING" "UPDATING", :updating "UPDATING", "DELETING" "DELETING", :deleting "DELETING"}] (clojure.core/fn [s__16141__auto__] (m__16140__auto__ s__16141__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 0 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/create-stream-input (portkey.aws/json-keys :req-un [:portkey.aws.kinesisvideo/StreamName] :opt-un [:portkey.aws.kinesisvideo/DeviceName :portkey.aws.kinesisvideo/MediaType :portkey.aws.kinesisvideo/KmsKeyId :portkey.aws.kinesisvideo/DataRetentionInHours] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/list-streams-input-limit (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16202__16203__auto__] (clojure.core/<= 1 p1__16202__16203__auto__)) (fn* [p1__16204__16205__auto__] (clojure.core/<= p1__16204__16205__auto__ 10000))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/tag-stream-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/delete-stream-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/tag-key-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.kinesisvideo/tag-key :min-count 1 :max-count 50) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/untag-stream-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/resource-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.resource-not-found-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/list-streams-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo/StreamInfoList :portkey.aws.kinesisvideo/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 0 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.invalid-device-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/invalid-device-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.invalid-device-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/kms-key-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.client-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/client-limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.client-limit-exceeded-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.invalid-argument-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/invalid-argument-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.invalid-argument-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.update-stream-input/streamarn (clojure.spec.alpha/and :portkey.aws.kinesisvideo/resourcearn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.update-stream-input/current-version (clojure.spec.alpha/and :portkey.aws.kinesisvideo/version))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/update-stream-input (portkey.aws/json-keys :req-un [:portkey.aws.kinesisvideo.update-stream-input/CurrentVersion] :opt-un [:portkey.aws.kinesisvideo/StreamName :portkey.aws.kinesisvideo.update-stream-input/StreamARN :portkey.aws.kinesisvideo/DeviceName :portkey.aws.kinesisvideo/MediaType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.device-stream-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/device-stream-limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.device-stream-limit-exceeded-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/device-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 128)) (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.list-tags-for-stream-input/streamarn (clojure.spec.alpha/and :portkey.aws.kinesisvideo/resourcearn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/list-tags-for-stream-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo/NextToken :portkey.aws.kinesisvideo.list-tags-for-stream-input/StreamARN :portkey.aws.kinesisvideo/StreamName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/get-data-endpoint-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo/DataEndpoint] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 64)) (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"[a-zA-Z0-9]+" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.list-streams-input/max-results (clojure.spec.alpha/and :portkey.aws.kinesisvideo/list-streams-input-limit))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/list-streams-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.list-streams-input/MaxResults :portkey.aws.kinesisvideo/NextToken :portkey.aws.kinesisvideo/StreamNameCondition] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/data-endpoint (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.create-stream-output/streamarn (clojure.spec.alpha/and :portkey.aws.kinesisvideo/resourcearn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/create-stream-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.create-stream-output/StreamARN] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.invalid-resource-format-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/invalid-resource-format-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.invalid-resource-format-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/data-retention-change-in-hours (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16202__16203__auto__] (clojure.core/<= 1 p1__16202__16203__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.delete-stream-input/streamarn (clojure.spec.alpha/and :portkey.aws.kinesisvideo/resourcearn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo.delete-stream-input/current-version (clojure.spec.alpha/and :portkey.aws.kinesisvideo/version))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/delete-stream-input (portkey.aws/json-keys :req-un [:portkey.aws.kinesisvideo.delete-stream-input/StreamARN] :opt-un [:portkey.aws.kinesisvideo.delete-stream-input/CurrentVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/update-data-retention-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.get-data-endpoint-input/streamarn (clojure.spec.alpha/and :portkey.aws.kinesisvideo/resourcearn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/get-data-endpoint-input (portkey.aws/json-keys :req-un [:portkey.aws.kinesisvideo/APIName] :opt-un [:portkey.aws.kinesisvideo/StreamName :portkey.aws.kinesisvideo.get-data-endpoint-input/StreamARN] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.account-stream-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.kinesisvideo/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/account-stream-limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo.account-stream-limit-exceeded-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/resourcearn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__16142__auto__] (clojure.core/<= 1 (clojure.core/count s__16142__auto__))) (clojure.core/fn [s__16143__auto__] (clojure.core/< (clojure.core/count s__16143__auto__) 1024)) (clojure.core/fn [s__16144__auto__] (clojure.core/re-matches #"arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+" s__16144__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo/update-stream-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.describe-stream-input/streamarn (clojure.spec.alpha/and :portkey.aws.kinesisvideo/resourcearn))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/describe-stream-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo/StreamName :portkey.aws.kinesisvideo.describe-stream-input/StreamARN] :locations {}))

(clojure.spec.alpha/def :portkey.aws.kinesisvideo.stream-name-condition/comparison-value (clojure.spec.alpha/and :portkey.aws.kinesisvideo/stream-name))
(clojure.spec.alpha/def :portkey.aws.kinesisvideo/stream-name-condition (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.kinesisvideo/ComparisonOperator :portkey.aws.kinesisvideo.stream-name-condition/ComparisonValue] :locations {}))

(clojure.core/defn delete-stream "Deletes a Kinesis video stream and the data contained in the stream.\n This method marks the stream for deletion, and makes the data in the stream\ninaccessible immediately.\n To ensure that you have the latest version of the stream before deleting it,\nyou can specify the stream version. Kinesis Video Streams assigns a version to\neach stream. When you update a stream, Kinesis Video Streams assigns a new\nversion number. To get the latest stream version, use the DescribeStream API.\n This operation requires permission for the KinesisVideo:DeleteStream action." ([delete-stream-input] (portkey.aws/-rest-json-call portkey.aws.kinesisvideo/endpoints "POST" "/deleteStream" delete-stream-input :portkey.aws.kinesisvideo/delete-stream-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.kinesisvideo/delete-stream-output {"ClientLimitExceededException" :portkey.aws.kinesisvideo/client-limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesisvideo/invalid-argument-exception, "ResourceNotFoundException" :portkey.aws.kinesisvideo/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.kinesisvideo/not-authorized-exception})))
(clojure.spec.alpha/fdef delete-stream :args (clojure.spec.alpha/tuple :portkey.aws.kinesisvideo/delete-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo/delete-stream-output))

(clojure.core/defn get-data-endpoint "Gets an endpoint for a specified stream for either reading or writing. Use this\nendpoint in your application to read from the specified stream (using the\nGetMedia or GetMediaForFragmentList operations) or write to it (using the\nPutMedia operation).\n The returned endpoint does not have the API name appended. The client needs to\nadd the API name to the returned endpoint.\n In the request, specify the stream either by StreamName or StreamARN." ([get-data-endpoint-input] (portkey.aws/-rest-json-call portkey.aws.kinesisvideo/endpoints "POST" "/getDataEndpoint" get-data-endpoint-input :portkey.aws.kinesisvideo/get-data-endpoint-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.kinesisvideo/get-data-endpoint-output {"InvalidArgumentException" :portkey.aws.kinesisvideo/invalid-argument-exception, "ResourceNotFoundException" :portkey.aws.kinesisvideo/resource-not-found-exception, "ClientLimitExceededException" :portkey.aws.kinesisvideo/client-limit-exceeded-exception, "NotAuthorizedException" :portkey.aws.kinesisvideo/not-authorized-exception})))
(clojure.spec.alpha/fdef get-data-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.kinesisvideo/get-data-endpoint-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo/get-data-endpoint-output))

(clojure.core/defn list-streams "Returns an array of StreamInfo objects. Each object describes a stream. To\nretrieve only streams that satisfy a specific condition, you can specify a\nStreamNameCondition." ([] (list-streams {})) ([list-streams-input] (portkey.aws/-rest-json-call portkey.aws.kinesisvideo/endpoints "POST" "/listStreams" list-streams-input :portkey.aws.kinesisvideo/list-streams-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.kinesisvideo/list-streams-output {"ClientLimitExceededException" :portkey.aws.kinesisvideo/client-limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesisvideo/invalid-argument-exception})))
(clojure.spec.alpha/fdef list-streams :args (clojure.spec.alpha/? :portkey.aws.kinesisvideo/list-streams-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo/list-streams-output))

(clojure.core/defn update-stream "Updates stream metadata, such as the device name and media type.\n You must provide the stream name or the Amazon Resource Name (ARN) of the\nstream.\n To make sure that you have the latest version of the stream before updating it,\nyou can specify the stream version. Kinesis Video Streams assigns a version to\neach stream. When you update a stream, Kinesis Video Streams assigns a new\nversion number. To get the latest stream version, use the DescribeStream API.\n UpdateStream is an asynchronous operation, and takes time to complete." ([update-stream-input] (portkey.aws/-rest-json-call portkey.aws.kinesisvideo/endpoints "POST" "/updateStream" update-stream-input :portkey.aws.kinesisvideo/update-stream-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.kinesisvideo/update-stream-output {"ClientLimitExceededException" :portkey.aws.kinesisvideo/client-limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesisvideo/invalid-argument-exception, "ResourceNotFoundException" :portkey.aws.kinesisvideo/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisvideo/resource-in-use-exception, "NotAuthorizedException" :portkey.aws.kinesisvideo/not-authorized-exception, "VersionMismatchException" :portkey.aws.kinesisvideo/version-mismatch-exception})))
(clojure.spec.alpha/fdef update-stream :args (clojure.spec.alpha/tuple :portkey.aws.kinesisvideo/update-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo/update-stream-output))

(clojure.core/defn create-stream "Creates a new Kinesis video stream.\n When you create a new stream, Kinesis Video Streams assigns it a version\nnumber. When you change the stream's metadata, Kinesis Video Streams updates the\nversion.\n CreateStream is an asynchronous operation.\n For information about how the service works, see How it Works\n(http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/how-it-works.html).\n You must have permissions for the KinesisVideo:CreateStream action." ([create-stream-input] (portkey.aws/-rest-json-call portkey.aws.kinesisvideo/endpoints "POST" "/createStream" create-stream-input :portkey.aws.kinesisvideo/create-stream-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.kinesisvideo/create-stream-output {"AccountStreamLimitExceededException" :portkey.aws.kinesisvideo/account-stream-limit-exceeded-exception, "DeviceStreamLimitExceededException" :portkey.aws.kinesisvideo/device-stream-limit-exceeded-exception, "ResourceInUseException" :portkey.aws.kinesisvideo/resource-in-use-exception, "InvalidDeviceException" :portkey.aws.kinesisvideo/invalid-device-exception, "InvalidArgumentException" :portkey.aws.kinesisvideo/invalid-argument-exception, "ClientLimitExceededException" :portkey.aws.kinesisvideo/client-limit-exceeded-exception})))
(clojure.spec.alpha/fdef create-stream :args (clojure.spec.alpha/tuple :portkey.aws.kinesisvideo/create-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo/create-stream-output))

(clojure.core/defn describe-stream "Returns the most current information about the specified stream. You must\nspecify either the StreamName or the StreamARN." ([] (describe-stream {})) ([describe-stream-input] (portkey.aws/-rest-json-call portkey.aws.kinesisvideo/endpoints "POST" "/describeStream" describe-stream-input :portkey.aws.kinesisvideo/describe-stream-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.kinesisvideo/describe-stream-output {"InvalidArgumentException" :portkey.aws.kinesisvideo/invalid-argument-exception, "ResourceNotFoundException" :portkey.aws.kinesisvideo/resource-not-found-exception, "ClientLimitExceededException" :portkey.aws.kinesisvideo/client-limit-exceeded-exception, "NotAuthorizedException" :portkey.aws.kinesisvideo/not-authorized-exception})))
(clojure.spec.alpha/fdef describe-stream :args (clojure.spec.alpha/? :portkey.aws.kinesisvideo/describe-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo/describe-stream-output))

(clojure.core/defn list-tags-for-stream "Returns a list of tags associated with the specified stream.\n In the request, you must specify either the StreamName or the StreamARN." ([] (list-tags-for-stream {})) ([list-tags-for-stream-input] (portkey.aws/-rest-json-call portkey.aws.kinesisvideo/endpoints "POST" "/listTagsForStream" list-tags-for-stream-input :portkey.aws.kinesisvideo/list-tags-for-stream-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.kinesisvideo/list-tags-for-stream-output {"ClientLimitExceededException" :portkey.aws.kinesisvideo/client-limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesisvideo/invalid-argument-exception, "ResourceNotFoundException" :portkey.aws.kinesisvideo/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.kinesisvideo/not-authorized-exception, "InvalidResourceFormatException" :portkey.aws.kinesisvideo/invalid-resource-format-exception})))
(clojure.spec.alpha/fdef list-tags-for-stream :args (clojure.spec.alpha/? :portkey.aws.kinesisvideo/list-tags-for-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo/list-tags-for-stream-output))

(clojure.core/defn update-data-retention " Increases or decreases the stream's data retention period by the value that you\nspecify. To indicate whether you want to increase or decrease the data retention\nperiod, specify the Operation parameter in the request body. In the request, you\nmust specify either the StreamName or the StreamARN.\n The retention period that you specify replaces the current value.\n This operation requires permission for the KinesisVideo:UpdateDataRetention\naction.\n Changing the data retention period affects the data in the stream as follows:\n * If the data retention period is increased, existing data is retained for the\nnew retention period. For example, if the data retention period is increased\nfrom one hour to seven hours, all existing data is retained for seven hours.\n * If the data retention period is decreased, existing data is retained for the\nnew retention period. For example, if the data retention period is decreased\nfrom seven hours to one hour, all existing data is retained for one hour, and\nany data older than one hour is deleted immediately." ([update-data-retention-input] (portkey.aws/-rest-json-call portkey.aws.kinesisvideo/endpoints "POST" "/updateDataRetention" update-data-retention-input :portkey.aws.kinesisvideo/update-data-retention-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.kinesisvideo/update-data-retention-output {"ClientLimitExceededException" :portkey.aws.kinesisvideo/client-limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesisvideo/invalid-argument-exception, "ResourceNotFoundException" :portkey.aws.kinesisvideo/resource-not-found-exception, "ResourceInUseException" :portkey.aws.kinesisvideo/resource-in-use-exception, "NotAuthorizedException" :portkey.aws.kinesisvideo/not-authorized-exception, "VersionMismatchException" :portkey.aws.kinesisvideo/version-mismatch-exception})))
(clojure.spec.alpha/fdef update-data-retention :args (clojure.spec.alpha/tuple :portkey.aws.kinesisvideo/update-data-retention-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo/update-data-retention-output))

(clojure.core/defn tag-stream "Adds one or more tags to a stream. A tag is a key-value pair (the value is\noptional) that you can define and assign to AWS resources. If you specify a tag\nthat already exists, the tag value is replaced with the value that you specify\nin the request. For more information, see Using Cost Allocation Tags\n(http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html)\nin the AWS Billing and Cost Management User Guide.\n You must provide either the StreamName or the StreamARN.\n This operation requires permission for the KinesisVideo:TagStream action.\n Kinesis video streams support up to 50 tags." ([tag-stream-input] (portkey.aws/-rest-json-call portkey.aws.kinesisvideo/endpoints "POST" "/tagStream" tag-stream-input :portkey.aws.kinesisvideo/tag-stream-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.kinesisvideo/tag-stream-output {"ClientLimitExceededException" :portkey.aws.kinesisvideo/client-limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesisvideo/invalid-argument-exception, "ResourceNotFoundException" :portkey.aws.kinesisvideo/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.kinesisvideo/not-authorized-exception, "InvalidResourceFormatException" :portkey.aws.kinesisvideo/invalid-resource-format-exception, "TagsPerResourceExceededLimitException" :portkey.aws.kinesisvideo/tags-per-resource-exceeded-limit-exception})))
(clojure.spec.alpha/fdef tag-stream :args (clojure.spec.alpha/tuple :portkey.aws.kinesisvideo/tag-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo/tag-stream-output))

(clojure.core/defn untag-stream "Removes one or more tags from a stream. In the request, specify only a tag key\nor keys; don't specify the value. If you specify a tag key that does not exist,\nit's ignored.\n In the request, you must provide the StreamName or StreamARN." ([untag-stream-input] (portkey.aws/-rest-json-call portkey.aws.kinesisvideo/endpoints "POST" "/untagStream" untag-stream-input :portkey.aws.kinesisvideo/untag-stream-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.kinesisvideo/untag-stream-output {"ClientLimitExceededException" :portkey.aws.kinesisvideo/client-limit-exceeded-exception, "InvalidArgumentException" :portkey.aws.kinesisvideo/invalid-argument-exception, "ResourceNotFoundException" :portkey.aws.kinesisvideo/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.kinesisvideo/not-authorized-exception, "InvalidResourceFormatException" :portkey.aws.kinesisvideo/invalid-resource-format-exception})))
(clojure.spec.alpha/fdef untag-stream :args (clojure.spec.alpha/tuple :portkey.aws.kinesisvideo/untag-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesisvideo/untag-stream-output))
